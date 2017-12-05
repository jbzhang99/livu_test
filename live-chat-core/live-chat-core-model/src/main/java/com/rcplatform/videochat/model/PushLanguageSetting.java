package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_push_language_setting")
@ApiModel
public class PushLanguageSetting implements Serializable {

    public PushLanguageSetting(Integer languageId, Integer pushType) {
        this.languageId = languageId;
        this.pushType = pushType;
    }

    public PushLanguageSetting() {
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 语言id
     */
    @Column(name = "language_id")
    @ApiModelProperty(value = "语言id")
    private Integer languageId;

    /**
     * 语言内容
     */
    @ApiModelProperty(value = "语言内容")
    private String content;

    /**
     * 推送类型 推送类型 0 好友上线消息 1 头像违规 2.举报后反馈 3.性别被更改 4. 充值成功 5. 获得奖励 6.攻击歧视警告  7. 解封提醒
     */
    @Column(name = "push_type")
    @ApiModelProperty(value = "推送类型 0 好友上线消息")
    private Integer pushType;

    /**
     * 语言名称
     */
    @Column(name = "language_name")
    @ApiModelProperty(value = "语言名称")
    private String languageName;

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
     * 获取语言内容
     *
     * @return content - 语言内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置语言内容
     *
     * @param content 语言内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取推送类型 0 好友上线消息
     *
     * @return push_type - 推送类型 0 好友上线消息
     */
    public Integer getPushType() {
        return pushType;
    }

    /**
     * 设置推送类型 0 好友上线消息
     *
     * @param pushType 推送类型 0 好友上线消息
     */
    public void setPushType(Integer pushType) {
        this.pushType = pushType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", languageId=").append(languageId);
        sb.append(", content=").append(content);
        sb.append(", pushType=").append(pushType);
        sb.append(", languageName=").append(languageName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}