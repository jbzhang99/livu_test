package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_image")
@ApiModel
public class UserImage implements Serializable {

    public UserImage() {
    }

    public static  class Builder{
        /**
         * 主键
         */
        private Integer id;

        /**
         * 用户id
         */
        private Integer userId;

        /**
         * 图片地址
         */
        private String imageUrl;

        /**
         * 图片顺序
         */
        private Integer sort;

        /**
         * 更新时间
         */
        private Date updateTime;

        /**
         * 创建时间
         */
        private Date createTime;


        public Builder() {
        }

        public Builder(Integer userId, Integer sort) {
            this.userId = userId;
            this.sort = sort;
        }


        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId){
            this.userId = userId;
            return this;
        }

        public Builder imageUrl(String imageUrl){
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder sort(Integer sort){
            this.sort = sort;
            return this;
        }

        public Builder updateTime(Date updateTime){
            this.updateTime = updateTime;
            return this;
        }

        public Builder createTime(Date createTime){
            this.createTime = createTime;
            return  this;
        }

        public UserImage build(){
            return new UserImage(this);
        }


    }


    private UserImage(Builder builder){
        this.id = builder.id;
        this.userId = builder.userId;
        this.imageUrl = builder.imageUrl;
        this.sort = builder.sort;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;
    }
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * 图片地址
     */
    @Column(name = "image_url")
    @ApiModelProperty(value="图片地址")
    private String imageUrl;

    /**
     * 图片顺序
     */
    @ApiModelProperty(value="图片顺序")
    private Integer sort;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取图片地址
     *
     * @return image_url - 图片地址
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imageUrl 图片地址
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取图片顺序
     *
     * @return sort - 图片顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置图片顺序
     *
     * @param sort 图片顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", sort=").append(sort);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}