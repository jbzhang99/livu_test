package com.rcplatform.livechat.response;

/**
 * Created by yang peng on 2016/11/21.
 */
public class HttpData {

    private String key;


    private String data;


    public HttpData() {
    }

    public HttpData(String key, String data) {
        this.key = key;
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpData{");
        sb.append("key='").append(key).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
