package com.rcplatform.livechat.dto.response;

import java.io.Serializable;

/**
 * Created by admin on 2017/4/13.
 */
public class EvaluateDto implements Serializable {


    private Integer num;

    private Integer level;


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EvaluateDto{");
        sb.append("num=").append(num);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
