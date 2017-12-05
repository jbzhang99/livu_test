package com.rcplatform.livechat.kafka.serialization;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * Created by admin on 2017/3/5.
 */
public class FastJsonSerializer implements  Serializer{


    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public byte[] serialize(String s, Object o) {
        return JSON.toJSONBytes(o);
    }

    @Override
    public void close() {

    }
}
