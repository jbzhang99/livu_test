package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Yang Peng on 2017/5/3.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ApiModel
public class UserImageDto implements Serializable {

    public UserImageDto() {
    }

    public UserImageDto(Integer id, Integer sort) {
        this.id = id;
        this.sort = sort;
    }

    public UserImageDto(String imageUrl, Integer id, Integer sort) {
        this.imageUrl = imageUrl;
        this.id = id;
        this.sort = sort;
    }

    public UserImageDto(String imageUrl, Integer sort) {
        this.imageUrl = imageUrl;
        this.sort = sort;
    }

    public UserImageDto(Integer sort) {
        this.sort = sort;
    }

    @ApiModelProperty(value = "图片url地址，服务器中已存在的图片地址")
    private String imageUrl;


    @ApiModelProperty(value = "图片id")
    private Integer id;


    @ApiModelProperty(value = "图片排序")
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserImageDto{");
        sb.append("id=").append(id);
        sb.append(", sort=").append(sort);
        sb.append('}');
        return sb.toString();
    }
}
