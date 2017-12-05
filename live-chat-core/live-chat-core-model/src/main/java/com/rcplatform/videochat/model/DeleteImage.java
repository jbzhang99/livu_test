package com.rcplatform.videochat.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_delete_image")
public class DeleteImage implements Serializable {

    public DeleteImage() {
    }

    public DeleteImage(Integer userId, String imageUrl, Date createTime) {
        this.userId = userId;
        this.imageUrl = imageUrl;
        this.createTime = createTime;
        this.eroticismLabel = 0;
        this.eroticismRate = 0.0;
        this.eroticismReview = 0;
        this.tag = 0;
    }

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 图片地址
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 是否是黄图
     */
    @Column(name = "eroticism_label")
    private Integer eroticismLabel;

    /**
     * 黄图概率
     */
    @Column(name = "eroticism_rate")
    private Double eroticismRate;

    /**
     * 黄图是否需要审核
     */
    @Column(name = "eroticism_review")
    private Integer eroticismReview;



    private Integer tag;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
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
     * 获取是否是黄图
     *
     * @return eroticism_label - 是否是黄图
     */
    public Integer getEroticismLabel() {
        return eroticismLabel;
    }

    /**
     * 设置是否是黄图
     *
     * @param eroticismLabel 是否是黄图
     */
    public void setEroticismLabel(Integer eroticismLabel) {
        this.eroticismLabel = eroticismLabel;
    }

    /**
     * 获取黄图概率
     *
     * @return eroticism_rate - 黄图概率
     */
    public Double getEroticismRate() {
        return eroticismRate;
    }

    /**
     * 设置黄图概率
     *
     * @param eroticismRate 黄图概率
     */
    public void setEroticismRate(Double eroticismRate) {
        this.eroticismRate = eroticismRate;
    }

    /**
     * 获取黄图是否需要审核
     *
     * @return eroticism_review - 黄图是否需要审核
     */
    public Integer getEroticismReview() {
        return eroticismReview;
    }

    /**
     * 设置黄图是否需要审核
     *
     * @param eroticismReview 黄图是否需要审核
     */
    public void setEroticismReview(Integer eroticismReview) {
        this.eroticismReview = eroticismReview;
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


    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeleteImage{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", eroticismLabel=").append(eroticismLabel);
        sb.append(", eroticismRate=").append(eroticismRate);
        sb.append(", eroticismReview=").append(eroticismReview);
        sb.append(", tag=").append(tag);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {

        private Integer id;

        private Integer userId;

        private String imageUrl;

        private Integer eroticismLabel;

        private Double eroticismRate;

        private Integer eroticismReview;

        private Integer tag;

        private Date createTime;

        public Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder eroticismLabel(Integer eroticismLabel) {
            this.eroticismLabel = eroticismLabel;
            return this;
        }

        public Builder eroticismRate(Double eroticismRate) {
            this.eroticismRate = eroticismRate;
            return this;
        }

        public Builder eroticismReview(Integer eroticismReview) {
            this.eroticismReview = eroticismReview;
            return this;
        }

        public Builder tag(Integer tag) {
            this.tag = tag;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public DeleteImage build() {
            DeleteImage deleteImage = new DeleteImage();
            deleteImage.setId(id);
            deleteImage.setUserId(userId);
            deleteImage.setImageUrl(imageUrl);
            deleteImage.setEroticismLabel(eroticismLabel);
            deleteImage.setEroticismRate(eroticismRate);
            deleteImage.setEroticismReview(eroticismReview);
            deleteImage.setTag(tag);
            deleteImage.setCreateTime(createTime);
            return deleteImage;
        }
    }
}