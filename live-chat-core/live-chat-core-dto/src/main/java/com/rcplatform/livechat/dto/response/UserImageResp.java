package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yang Peng on 2017/5/4.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserImageResp implements Serializable {


    public UserImageResp() {
    }

    public UserImageResp(String headImg, String background, List<UserImage> userImages) {
        this.headImg = headImg;
        this.background = background;
        this.userImages = userImages;
    }

    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "背景")
    private String background;

    @ApiModelProperty(value = "用户相册")
    private List<UserImage> userImages;




    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public List<UserImage> getUserImages() {
        return userImages;
    }

    public void setUserImages(List<UserImage> userImages) {
        this.userImages = userImages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserImageResp{");
        sb.append("headImg='").append(headImg).append('\'');
        sb.append(", background='").append(background).append('\'');
        sb.append(", userImages=").append(userImages);
        sb.append('}');
        return sb.toString();
    }
}
