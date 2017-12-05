package com.rcplatform.livechat.encrypt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.io.CharStreams;
import com.rcplatform.livechat.response.HttpData;
import com.rcplatform.livechat.util.DesUtil;
import com.rcplatform.livechat.util.RsaUtil;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.lang.reflect.Type;


/**
 * Created by yang peng on 2016/9/30.
 */
public class EncryptHttpMessageConverter extends FastJsonHttpMessageConverter {


    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String json = decryptJson(inputMessage);
        return JSON.parseObject(json, type, getFastJsonConfig().getFeatures());
    }



    @Override
    protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String json = decryptJson(inputMessage);
        return JSON.parseObject(json,clazz,getFastJsonConfig().getFeatures());
    }



    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        ByteArrayOutputStream outNew= new ByteArrayOutputStream();
        OutputStream out = outputMessage.getBody();
        String encryptJson = encryptJson(obj);
        outNew.write(encryptJson.getBytes());
        outNew.writeTo(out);
        outNew.close();
    }



    private String decryptJson(HttpInputMessage inputMessage)  throws IOException, HttpMessageNotReadableException  {
        InputStream in = inputMessage.getBody();
        String text = CharStreams.toString(new InputStreamReader(in, "UTF-8"));
        HttpData httpData = JSONObject.parseObject(text, HttpData.class);
        try {
            String key = RsaUtil.decryptRequest(httpData.getKey());
            String decrypt = DesUtil.decrypt(httpData.getData(),key);
            return decrypt;
        } catch (Exception e) {
            throw new HttpMessageNotReadableException("解密失败");
        }
    }


    private String encryptJson(Object obj){
        String random = RandomStringUtils.randomAlphanumeric(8);
        try {
            String key = RsaUtil.encryptResponse(random);
            String decrypt = DesUtil.encrypt(JSON.toJSONString(obj), random);
            HttpData httpdata = new HttpData(key,decrypt);
            return JSON.toJSONString(httpdata);
        } catch (Exception e) {
            throw new HttpMessageNotReadableException("加密失败");
        }
    }



}
