package com.rcplatform.livechat;


/**
 * Created by Yang Peng on 2017/6/14.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public enum  DataSourceType {


    read("read", "从库"),
    write("write", "主库");


    private String type;

    private String name;

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
