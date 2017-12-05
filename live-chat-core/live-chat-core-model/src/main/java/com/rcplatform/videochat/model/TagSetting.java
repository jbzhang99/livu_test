package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_tag_setting")
@ApiModel
public class TagSetting implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 标签名称
     */
    @Column(name = "tag_name")
    @ApiModelProperty(value="标签名称")
    private String tagName;

    /**
     * 用户标签维持时间（分钟为单位）
     */
    @Column(name = "keep_time")
    @ApiModelProperty(value="用户标签维持时间（分钟为单位）")
    private Integer keepTime;

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
     * 获取标签名称
     *
     * @return tag_name - 标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置标签名称
     *
     * @param tagName 标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * 获取用户标签维持时间（分钟为单位）
     *
     * @return keep_time - 用户标签维持时间（分钟为单位）
     */
    public Integer getKeepTime() {
        return keepTime;
    }

    /**
     * 设置用户标签维持时间（分钟为单位）
     *
     * @param keepTime 用户标签维持时间（分钟为单位）
     */
    public void setKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
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
        sb.append(", tagName=").append(tagName);
        sb.append(", keepTime=").append(keepTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}