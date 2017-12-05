package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/*
 * Created by yang peng on 2016/8/1.
 */
@ApiModel
public class UserAutoLoginDto implements Serializable {

    public UserAutoLoginDto() {
    }

    public UserAutoLoginDto(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private String latitude;

    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private String longitude;



    @ApiModelProperty(value = "时区")
    private Integer timeZone;



    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Integer timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "UserAutoLoginDto{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", timeZone=" + timeZone +
                '}';
    }
}
