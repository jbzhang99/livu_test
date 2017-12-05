package com.rcplatform.videochat.bean;

import java.io.Serializable;

/**
 * Created by 药耀源 on 2017/5/5.
 */
public class KeyValue implements Serializable {

    private Integer key;
    private String name;
    private Integer value;

    public KeyValue() {
    }

    public KeyValue(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
