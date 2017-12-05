package com.rcplatform.livechat.util;


import com.rcplatform.livechat.constant.RedisKeyConstant;

/**
 * Created by yang peng on 2016/11/28.
 */
public class RedisKeyFactory {


    public static String getKey(Object...objects){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(RedisKeyConstant.APP_NAME);
        for(int i=0;i<objects.length;i++){
            stringBuilder.append(":").append(objects[i]);
        }
        return stringBuilder.toString();
    }


    //打包记录
    public static String packageKey(Object...objects){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(objects[0]);
        if(objects.length>1){
            for(int i=1;i<objects.length;i++){
                if(objects[i]!=null){
                    stringBuilder.append(":").append(objects[i]);
                }
            }
        }
        return stringBuilder.toString();
    }
}
