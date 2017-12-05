package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/7/6.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserDeleteDto implements Serializable {


    @ApiModelProperty(value = "删除的用户id,必须和get 参数中 userId一致")
    @Min(1)
    @NotNull
    private Integer userId;


    @ApiModelProperty(value = "加密串，算法 （userId ＋token） md5加密")
    @NotEmpty
    private String a77450ae83840486191177d49745f1fb4;



    @ApiModelProperty(value = "答案为 1,2,3,4,5,6")
    @Range(min = 1,max = 6)
    @NotNull
    private Integer answer;


    @ApiModelProperty(value = "反馈")
    private String feedback;


    public Integer getUserId() {
        return userId;
    }




    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getA77450ae83840486191177d49745f1fb4() {
        return a77450ae83840486191177d49745f1fb4;
    }

    public void setA77450ae83840486191177d49745f1fb4(String a77450ae83840486191177d49745f1fb4) {
        this.a77450ae83840486191177d49745f1fb4 = a77450ae83840486191177d49745f1fb4;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDeleteDto{");
        sb.append("userId=").append(userId);
        sb.append(", a77450ae83840486191177d49745f1fb4='").append(a77450ae83840486191177d49745f1fb4).append('\'');
        sb.append(", answer=").append(answer);
        sb.append(", feedback='").append(feedback).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
