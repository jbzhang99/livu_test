package com.rcplatform.videochat.model;

import java.util.Date;

/**
 * Created by fj on 2017/5/4.
 */
public class Video {

    private Integer id;

    private String name;

    private String country;

    private String email;

    private String liveChatAccount;

    private String videoUrl;

    private String videoImage;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLiveChatAccount() {
        return liveChatAccount;
    }

    public void setLiveChatAccount(String liveChatAccount) {
        this.liveChatAccount = liveChatAccount;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }
}
