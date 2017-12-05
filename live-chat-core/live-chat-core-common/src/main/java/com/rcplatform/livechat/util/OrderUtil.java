package com.rcplatform.livechat.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2017/1/3.
 */
public class OrderUtil {

    private static Pattern humpPattern = Pattern.compile("[A-Z]");


    /**驼峰转下划线*/
    public static String humpToLine(String str){
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, "_"+matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    public static String getOrder(String sort, String direction){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(humpToLine(sort)).append(" ").append(direction);
        return stringBuilder.toString();
    }
}
