package com.rcplatform.livechat.http;

import com.alibaba.fastjson.JSON;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Converter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by apple on 2017/4/9.
 */
public class FastJsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {


    private Logger logger = LoggerFactory.getLogger(FastJsonResponseBodyConverter.class);

    private final Type type;

    public FastJsonResponseBodyConverter(Type type) {
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        BufferedSource bufferedSource = Okio.buffer(value.source());
        String tempStr = bufferedSource.readUtf8();
        bufferedSource.close();
        return JSON.parseObject(tempStr, type);
    }
}
