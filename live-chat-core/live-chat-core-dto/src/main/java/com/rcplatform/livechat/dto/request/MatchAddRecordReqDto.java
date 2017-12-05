package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yang peng on 2016/8/5.
 */
@ApiModel
public class MatchAddRecordReqDto implements Serializable{



    @NotNull
    @ApiModelProperty(value = "匹配的用户id")
    private List<Integer> matchUserIdList;


    public List<Integer> getMatchUserIdList() {
        return matchUserIdList;
    }

    public void setMatchUserIdList(List<Integer> matchUserIdList) {
        this.matchUserIdList = matchUserIdList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchAddRecordReqDto{");
        sb.append("matchUserIdList=").append(matchUserIdList);
        sb.append('}');
        return sb.toString();
    }
}
