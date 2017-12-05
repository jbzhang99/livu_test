package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_verification")
@ApiModel
public class UserVerification implements Serializable {


    public UserVerification() {
    }


    public UserVerification(Integer userId, String loginToken) {
        this.userId = userId;
        this.loginToken = loginToken;
    }

    public UserVerification(Integer id, Date emailTokenExpiration) {
        this.id = id;
        this.emailTokenExpiration = emailTokenExpiration;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    @Column(name = "user_id")
    @ApiModelProperty(value="")
    private Integer userId;

    /**
     * 金币数量
     */
    @Column(name = "login_token")
    @ApiModelProperty(value="金币数量")
    private String loginToken;

    /**
     * 邮箱验证token
     */
    @Column(name = "email_token")
    @ApiModelProperty(value="邮箱验证token")
    private String emailToken;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;


    /**
     *
     * 登录token的过期时间
     */
    @Column(name = "login_token_expiration")
    @ApiModelProperty(value="登录token的过期时间")
    private Date loginTokenExpiration;

    /**
     *  邮箱验证的过期时间
     */
    @Column(name = "email_token_expiration")
    @ApiModelProperty(value=" 邮箱验证的过期时间")
    private Date emailTokenExpiration;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取金币数量
     *
     * @return login_token - 金币数量
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * 设置金币数量
     *
     * @param loginToken 金币数量
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    /**
     * 获取邮箱验证token
     *
     * @return email_token - 邮箱验证token
     */
    public String getEmailToken() {
        return emailToken;
    }

    /**
     * 设置邮箱验证token
     *
     * @param emailToken 邮箱验证token
     */
    public void setEmailToken(String emailToken) {
        this.emailToken = emailToken;
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
     * 获取登录token的过期时间
     *
     * @return login_token_expiration - 登录token的过期时间
     */
    public Date getLoginTokenExpiration() {
        return loginTokenExpiration;
    }

    /**
     * 设置登录token的过期时间
     *
     * @param loginTokenExpiration 登录token的过期时间
     */
    public void setLoginTokenExpiration(Date loginTokenExpiration) {
        this.loginTokenExpiration = loginTokenExpiration;
    }

    /**
     * 获取 邮箱验证的过期时间
     *
     * @return email_token_expiration -  邮箱验证的过期时间
     */
    public Date getEmailTokenExpiration() {
        return emailTokenExpiration;
    }

    /**
     * 设置 邮箱验证的过期时间
     *
     * @param emailTokenExpiration  邮箱验证的过期时间
     */
    public void setEmailTokenExpiration(Date emailTokenExpiration) {
        this.emailTokenExpiration = emailTokenExpiration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", loginToken=").append(loginToken);
        sb.append(", emailToken=").append(emailToken);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginTokenExpiration=").append(loginTokenExpiration);
        sb.append(", emailTokenExpiration=").append(emailTokenExpiration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}