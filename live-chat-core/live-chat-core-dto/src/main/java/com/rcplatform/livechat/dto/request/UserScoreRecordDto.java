package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/4.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserScoreRecordDto implements Serializable {


    @ApiModelProperty(value = "评级id 1.好评 2.中评 3.差评 ")
    @NotNull
    @Min(1)
    private int id;


    @NotNull
    @ApiModelProperty(value = "被评分人的userId")
    private Integer scoreUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getScoreUserId() {
        return scoreUserId;
    }

    public void setScoreUserId(Integer scoreUserId) {
        this.scoreUserId = scoreUserId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserScoreRecordDto{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
