package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


/**
 * Created by yang peng on 2016/8/24.
 */
@ApiModel
public class UserRelationDto extends UserFriendDto {


    @ApiModelProperty(value = "用户关系")
    private Integer relation;

    @ApiModelProperty(value = "是否是hot用户")
    private Boolean ifHot;

    @ApiModelProperty(value = "Top接口返回字段,为总钻石数或者金币数")
    private Integer sum;

    @ApiModelProperty(value = "用户累计钻石数")
    private BigDecimal stone;




    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public Boolean getIfHot() {
        return ifHot;
    }

    public void setIfHot(Boolean ifHot) {
        this.ifHot = ifHot;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public BigDecimal getStone() {
        return stone;
    }

    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }


}
