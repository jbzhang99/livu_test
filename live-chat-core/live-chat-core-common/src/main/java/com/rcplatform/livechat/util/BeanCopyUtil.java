package com.rcplatform.livechat.util;


import org.springframework.cglib.beans.BeanCopier;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yang peng on 2016/10/31.
 */
public class BeanCopyUtil {


    public static Map<String,BeanCopier> beanCopierMap = new ConcurrentHashMap<>();


    public static void copy(Object src,Object dest){
        String key = genKey(src.getClass(), dest.getClass());
        BeanCopier beanCopier = null;
        if(!beanCopierMap.containsKey(key)){
             beanCopier = BeanCopier.create(src.getClass(),dest.getClass(),false);
            beanCopierMap.put(key,beanCopier);
        }else{
            beanCopier = beanCopierMap.get(key);
        }
        beanCopier.copy(src,dest,null);
    }


    private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(srcClazz.getName()).append(destClazz.getName());
        return stringBuilder.toString();
    }

}
