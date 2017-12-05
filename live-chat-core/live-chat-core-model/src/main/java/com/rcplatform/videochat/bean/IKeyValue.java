package com.rcplatform.videochat.bean;

import java.io.Serializable;

/**
 * Created by yaoyuan on 2017/7/20.
 */
public class IKeyValue<K,V> implements Serializable {

    private K key;

    private V value;

    public IKeyValue() {
    }

    public IKeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
