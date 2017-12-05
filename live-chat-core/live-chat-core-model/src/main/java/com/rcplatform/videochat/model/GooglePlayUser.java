package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_google_play_user")
@ApiModel
public class GooglePlayUser implements Serializable {


    public GooglePlayUser(Integer id, String accessToken, Date expireTime) {
        this.id = id;
        this.accessToken = accessToken;
        this.expireTime = expireTime;
    }

    public GooglePlayUser() {
    }


    @Column(name = "app_id")
    @ApiModelProperty(value = "应用id")
    private Integer appId;

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 客户端id
     */
    @Column(name = "client_id")
    @ApiModelProperty(value="客户端id")
    private String clientId;

    /**
     * 客户端密钥
     */
    @Column(name = "client_secret")
    @ApiModelProperty(value="客户端密钥")
    private String clientSecret;

    /**
     * 跳转url
     */
    @Column(name = "redirect_uri")
    @ApiModelProperty(value="跳转url")
    private String redirectUri;

    /**
     * 令牌
     */
    @Column(name = "access_token")
    @ApiModelProperty(value="令牌")
    private String accessToken;

    /**
     * 刷新令牌
     */
    @Column(name = "refresh_token")
    @ApiModelProperty(value="刷新令牌")
    private String refreshToken;

    /**
     * 截至时间
     */
    @Column(name = "expire_time")
    @ApiModelProperty(value="截至时间")
    private Date expireTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;





    private static final long serialVersionUID = 1L;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

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
     * 获取客户端id
     *
     * @return client_id - 客户端id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置客户端id
     *
     * @param clientId 客户端id
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取客户端密钥
     *
     * @return client_secret - 客户端密钥
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 设置客户端密钥
     *
     * @param clientSecret 客户端密钥
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * 获取跳转url
     *
     * @return redirect_uri - 跳转url
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * 设置跳转url
     *
     * @param redirectUri 跳转url
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * 获取令牌
     *
     * @return access_token - 令牌
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置令牌
     *
     * @param accessToken 令牌
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取刷新令牌
     *
     * @return refresh_token - 刷新令牌
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 设置刷新令牌
     *
     * @param refreshToken 刷新令牌
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取截至时间
     *
     * @return expire_time - 截至时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置截至时间
     *
     * @param expireTime 截至时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", redirectUri=").append(redirectUri);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}