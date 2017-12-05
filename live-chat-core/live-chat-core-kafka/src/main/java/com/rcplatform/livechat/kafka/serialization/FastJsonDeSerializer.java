package com.rcplatform.livechat.kafka.serialization;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * Created by admin on 2017/3/5.
 */
public class FastJsonDeSerializer implements Deserializer {
    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public Object deserialize(String s, byte[] bytes) {
        Object parse = JSON.parse(bytes);
        return parse;
    }

    @Override
    public void close() {

    }
}
