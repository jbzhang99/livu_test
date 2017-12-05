package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.UserImage;

import java.util.List;

/**
 * Created by Yang Peng on 2017/5/4.
 *
 * @Description: 用户相册信息
 */
public class UserImageSonResp extends UserImageResp {


    public UserImageSonResp(String headImg, String background, List<UserImage> userImages, Integer gender, List<String> oldImages) {
        super(headImg, background, userImages);
        this.gender = gender;
        this.oldImages = oldImages;
    }

    public UserImageSonResp() {
    }

    private Integer gender;


    private List<String> oldImages;




    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public List<String> getOldImages() {
        return oldImages;
    }

    public void setOldImages(List<String> oldImages) {
        this.oldImages = oldImages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserImageSonResp{");
        sb.append("gender=").append(gender);
        sb.append(", oldImages=").append(oldImages);
        sb.append('}');
        return sb.toString();
    }
}
