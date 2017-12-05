package com.rcplatform.livechat.redis;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.jedis.Tuple;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Yang Peng on 2017/5/19.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class RedisClient {


    private static final Logger logger = LoggerFactory.getLogger(RedisClient.class);


    private ShardedJedisPool writeRedisPool;


    private ShardedJedisPool readRedisPoolOne;


    private ShardedJedisPool readRedisPoolTwo;


    /**
     * 执行有返回结果的action。
     */
    private <R> R submitWrite(Function<ShardedJedis, R> function) {
        ShardedJedis shardedJedis = null;
        try {
            shardedJedis = writeRedisPool.getResource();
            return function.apply(shardedJedis);
        } catch (Exception e) {
            logger.error("Redis action failed!", e);
            throw e;
        } finally {
            if (shardedJedis != null) {
                shardedJedis.close();
            }
        }
    }


    private void executeWrite(Consumer<ShardedJedis> consumer) {
        ShardedJedis shardedJedis = null;
        try {
            shardedJedis = getWriteShardedJedis();
            consumer.accept(shardedJedis);
        } catch (Exception e) {
            logger.error("Redis action failed!", e);
            throw e;
        } finally {
            if (shardedJedis != null) {
                shardedJedis.close();
            }
        }
    }


    /**
     * 执行有返回结果的action。
     */
    private <R> R executeRead(Function<ShardedJedis, R> function) {
        ShardedJedis shardedJedis = null;
        try {
            shardedJedis = getReadShardedJedis();
            return function.apply(shardedJedis);
        } catch (Exception e) {
            logger.error("Redis action failed!", e);
            throw e;
        } finally {
            if (shardedJedis != null) {
                shardedJedis.close();
            }
        }
    }


    private synchronized ShardedJedis getWriteShardedJedis() {
        return writeRedisPool.getResource();
    }


    private synchronized ShardedJedis getReadShardedJedis() {
        Random random = new Random();
        int tmp = random.nextInt(2) + 1;
        if (tmp == 1) {
            return readRedisPoolOne.getResource();
        } else {
            return readRedisPoolTwo.getResource();
        }
    }

    /**
     * 设置键值的生存时间
     *
     * @param key      键
     * @param unixTime unix 时间戳
     */
    public void expireat(String key, Long unixTime) {
        executeWrite(shardedJedis -> shardedJedis.expireAt(key, unixTime));
    }


    public void expire(String key, Integer seconds) {
        executeWrite(shardedJedis -> shardedJedis.expire(key, seconds));
    }

    /**
     * 设置键值
     *
     * @param key   键
     * @param value 值
     */
    public void set(String key, String value) {
        executeWrite(shardedJedis -> shardedJedis.set(key, value));
    }

    /**
     * set 一个键，并设置过期时间
     *
     * @param key     键
     * @param value   值
     * @param seconds 秒
     */
    public void setex(String key, Integer seconds, String value) {
        executeWrite(shardedJedis -> shardedJedis.setex(key, seconds, value));
    }


    /**
     * hset 保存一个 field value
     *
     * @param key   键
     * @param field
     * @param value
     */
    public void hset(String key, String field, String value) {
        executeWrite(shardedJedis -> shardedJedis.hset(key, field, value));
    }


    /**
     * 保存多个 filed value
     *
     * @param key
     * @param hash
     */
    public void hmset(String key, Map<String, String> hash) {
        executeWrite(shardedJedis -> shardedJedis.hmset(key, hash));
    }

    /**
     * hget 获取一个键的一个field
     *
     * @param key
     * @param field
     */
    public String hget(String key, String field) {
        return executeRead(shardedJedis -> shardedJedis.hget(key, field));
    }


    /**
     * hdel 删除hash 中的field
     *
     * @param key
     * @param fields
     */
    public void hdel(String key, String... fields) {
        executeWrite(shardedJedis -> shardedJedis.hdel(key, fields));
    }

    /**
     * set 一个 set 值
     *
     * @param key
     * @param values
     * @param seconds
     */
    public void setexId(String key, Integer seconds, Set<String> values) {
        String s = get(key);
        String collect = values.stream().collect(Collectors.joining(","));
        if (s != null) {
            StringBuilder stringBuilder = new StringBuilder().append(s).append(",").append(collect);
            setex(key, seconds, stringBuilder.toString());
        } else {
            setex(key, seconds, collect);
        }
    }


    /**
     * set 一个 set 值
     *
     * @param key
     * @param values
     */
    public void setId(String key, Set<String> values) {
        String s = get(key);
        String collect = values.stream().collect(Collectors.joining(","));
        if (s != null) {
            StringBuilder stringBuilder = new StringBuilder().append(s).append(",").append(collect);
            set(key, stringBuilder.toString());
        } else {
            set(key, collect);
        }
    }


    public void setId(String key, String value) {
        String s = get(key);
        if (s != null) {
            StringBuilder stringBuilder = new StringBuilder().append(s).append(",").append(value);
            set(key, stringBuilder.toString());
        } else {
            set(key, value);
        }
    }

    /**
     * 在原有 set 值上增加一个id
     *
     * @param key
     * @param seconds
     * @param value
     */
    public void setexId(String key, Integer seconds, String value) {
        String s = get(key);
        if (s != null) {
            StringBuilder stringBuilder = new StringBuilder().append(s).append(",").append(value);
            setex(key, seconds, stringBuilder.toString());
        } else {
            setex(key, seconds, value);
        }
    }


    /**
     * 将用户id 从value 中移除
     *
     * @param key
     * @param seconds
     * @param value
     */
    public void delId(String key, Integer seconds, String value) {
        String s = get(key);
        if (s != null) {
            Set<String> collect = Stream.of(s.split(",")).collect(Collectors.toSet());
            collect.remove(value);
            String str = collect.stream().collect(Collectors.joining(","));
            setex(key, seconds, str);
        }

    }


    public void delId(String key, String value) {
        String s = get(key);
        if (s != null) {
            Set<String> collect = Stream.of(s.split(",")).collect(Collectors.toSet());
            collect.remove(value);
            String str = collect.stream().collect(Collectors.joining(","));
            set(key, str);
        }

    }

    /**
     * 从一个value key中获取一个set对象
     *
     * @param key
     * @return
     */
    public Set<String> getId(String key) {
        String s = get(key);
        if (StringUtils.isNotEmpty(s)) {
            return Arrays.stream(s.split(",")).collect(Collectors.toSet());
        }
        return new HashSet<>();

    }

    /**
     * 获取键值
     *
     * @param key 键
     * @return 值
     */
    public String get(String key) {
        return executeRead(shardedJedis -> shardedJedis.get(key));
    }


    /**
     * 删除一个或多个key
     *
     * @param keys 键
     */
    public void del(String... keys) {
        executeWrite(shardedJedis -> Stream.of(keys).forEach(shardedJedis::del));
    }


    /**
     * 返回set 集合 key 中的所有成员
     *
     * @param key 键
     * @return set 集合
     */
    public Set<String> smembers(String key) {
        return executeRead(shardedJedis -> shardedJedis.smembers(key));
    }

    /**
     * 将一个或多个 member 元素加入到集合 key 当中，已经存在于集合的 member 元素将被忽略
     *
     * @param key     键
     * @param members 元素
     */
    public void sadd(String key, String... members) {
        executeWrite(shardedJedis -> shardedJedis.sadd(key, members));
    }


    /**
     * 移除集合 key 中的一个或多个 member 元素，不存在的 member 元素会被忽略
     *
     * @param key     键
     * @param members 元素
     */
    public void srem(String key, String... members) {
        executeWrite(shardedJedis -> shardedJedis.srem(key, members));
    }


    public boolean setnx(String key, String value) {
        Long result = submitWrite(shardedJedis -> shardedJedis.setnx(key, value));
        return result > 0;

    }

    /**
     * 获取集合中的元素数量
     *
     * @param key
     * @return
     */
    public Long scard(String key) {
        return executeRead(shardedJedis -> shardedJedis.scard(key));
    }


    /**
     * 随机从set 集合中取出一个元素
     *
     * @param key 键
     * @return 一个元素
     */
    public String srandmember(String key) {
        return executeRead(shardedJedis -> shardedJedis.srandmember(key));
    }


    public Map<String, String> hgetAll(String key) {
        return executeRead(shardedJedis -> shardedJedis.hgetAll(key));
    }


    public void incr(String key) {
        executeWrite(shardedJedis -> shardedJedis.incr(key));
    }


    public void incrBy(String key, long integer) {
        executeWrite(shardedJedis -> shardedJedis.incrBy(key, integer));
    }

    public Set<Tuple> zrevrangeByScoreWithScores(String key, String min, String max) {
        return executeRead(shardedJedis -> shardedJedis.zrangeByScoreWithScores(key, min, max));
    }


    /**
     * 向有序集合中添加元素
     *
     * @param key
     * @param scoreMembers
     */
    public void zadd(String key, Map<String, Double> scoreMembers) {
        executeWrite(shardedJedis -> shardedJedis.zadd(key, scoreMembers));
    }


    public boolean sismember(String key, String member) {
        return executeRead(shardedJedis -> shardedJedis.sismember(key, member));
    }


    public Long ttl(String key) {
        return executeRead(shardedJedis -> shardedJedis.ttl(key));
    }


    public ShardedJedisPool getWriteRedisPool() {
        return writeRedisPool;
    }

    public void setWriteRedisPool(ShardedJedisPool writeRedisPool) {
        this.writeRedisPool = writeRedisPool;
    }

    public ShardedJedisPool getReadRedisPoolOne() {
        return readRedisPoolOne;
    }

    public void setReadRedisPoolOne(ShardedJedisPool readRedisPoolOne) {
        this.readRedisPoolOne = readRedisPoolOne;
    }

    public ShardedJedisPool getReadRedisPoolTwo() {
        return readRedisPoolTwo;
    }

    public void setReadRedisPoolTwo(ShardedJedisPool readRedisPoolTwo) {
        this.readRedisPoolTwo = readRedisPoolTwo;
    }


    public String getSet(String key, String value) {
        return executeRead(shardedJedis -> shardedJedis.getSet(key, value));
    }
}
