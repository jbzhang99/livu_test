package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yang peng on 2016/8/4.
 */
@ApiModel
public class UserMatchedDto extends UserMatchedResp {

    /**
     * 是否是朋友关系
     */

    @ApiModelProperty(value = "是否是朋友关系")
    private Integer relation;

    /**
     * 匹配记录id
     */

    @ApiModelProperty(value = "匹配记录id")
    private Integer matchRecordId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;


    public Integer getMatchRecordId() {
        return matchRecordId;
    }

    public void setMatchRecordId(Integer matchRecordId) {
        this.matchRecordId = matchRecordId;
    }


    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMatchedDto{");
        sb.append("relation=").append(relation);
        sb.append(", matchRecordId=").append(matchRecordId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
