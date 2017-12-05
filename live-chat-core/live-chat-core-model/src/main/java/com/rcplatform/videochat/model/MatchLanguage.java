package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_match_language")
@ApiModel
public class MatchLanguage implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 语言id
     */
    @Column(name = "language_id")
    @ApiModelProperty(value="语言id")
    private Integer languageId;

    /**
     * 语言名称
     */
    @Column(name = "language_name")
    @ApiModelProperty(value="语言名称")
    private String languageName;

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
     * 获取语言id
     *
     * @return language_id - 语言id
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * 设置语言id
     *
     * @param languageId 语言id
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * 获取语言名称
     *
     * @return language_name - 语言名称
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * 设置语言名称
     *
     * @param languageName 语言名称
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
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
        sb.append(", languageId=").append(languageId);
        sb.append(", languageName=").append(languageName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}