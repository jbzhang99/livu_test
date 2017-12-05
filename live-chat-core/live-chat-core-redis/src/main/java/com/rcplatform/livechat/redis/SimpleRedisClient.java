package com.rcplatform.livechat.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;
import java.util.function.Function;

/**
 * Created by Yang Peng on 2017/6/7.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class SimpleRedisClient {


    private JedisPool jedisPool;


    private Logger logger = LoggerFactory.getLogger(SimpleRedisClient.class);

    /**
     * 执行有返回结果的action。
     */
    private <R> R execute(Function<Jedis, R> function) {
        Jedis jedis = null;
        try {
            jedis = getJedis();
            return function.apply(jedis);
        } catch (Exception e) {
            logger.error("Redis action failed!", e);
            throw e;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }


    private synchronized Jedis getJedis() {
        return jedisPool.getResource();
    }


    public void incr(String key) {
        execute(jedis -> jedis.incr(key));
    }


    public void incrBy(String key, long integer) {
        execute(jedis -> jedis.incrBy(key, integer));
    }


    public void expire(String key, Integer seconds) {
        execute(jedis -> jedis.expire(key, seconds));
    }


    public String get(String key) {
        return execute(jedis -> jedis.get(key));
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }


    public void zadd(String key, double score, String member) {
        execute(jedis -> jedis.zadd(key, score, member));
    }

    public Set<String> zremrangeByScore(String key,String min,String max){
        Set<String> execute = execute(jedis -> jedis.zrangeByScore(key, min, max));
        return execute;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
}
