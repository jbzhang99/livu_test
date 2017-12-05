package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_google_play_consume")
@ApiModel
public class GooglePlayConsume implements Serializable {


    public GooglePlayConsume() {
    }


    public GooglePlayConsume(Integer userId, Integer userPayRecordId, String signture,
                             String signtureData, String packageName, String productId, String token, Integer result) {
        this.userId = userId;
        this.userPayRecordId = userPayRecordId;
        this.signture = signture;
        this.signtureData = signtureData;
        this.packageName = packageName;
        this.productId = productId;
        this.token = token;
        this.result = result;
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
     * 用户支付订单id
     */
    @Column(name = "user_pay_record_id")
    @ApiModelProperty(value="用户支付订单id")
    private Integer userPayRecordId;

    /**
     * google签名字符串
     */
    @ApiModelProperty(value="google签名字符串")
    private String signture;

    /**
     * google 签名的数据
     */
    @Column(name = "signture_data")
    @ApiModelProperty(value="google 签名的数据")
    private String signtureData;

    /**
     * 支付包名称
     */
    @Column(name = "package_name")
    @ApiModelProperty(value="支付包名称")
    private String packageName;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    @ApiModelProperty(value="产品id")
    private String productId;

    /**
     * 用户支付token
     */
    @ApiModelProperty(value="用户支付token")
    private String token;


    @Column(name = "data_verify")
    @ApiModelProperty(value = "本地验证结果")
    private String dataVerify;
    /**
     * 服务端请求验证结果 0 成功 1 通信失败
     */
    @ApiModelProperty(value="服务端请求验证结果 0 成功 1 通信失败")
    private Integer result;

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
     * 获取用户支付订单id
     *
     * @return user_pay_record_id - 用户支付订单id
     */
    public Integer getUserPayRecordId() {
        return userPayRecordId;
    }

    /**
     * 设置用户支付订单id
     *
     * @param userPayRecordId 用户支付订单id
     */
    public void setUserPayRecordId(Integer userPayRecordId) {
        this.userPayRecordId = userPayRecordId;
    }

    /**
     * 获取google签名字符串
     *
     * @return signture - google签名字符串
     */
    public String getSignture() {
        return signture;
    }

    /**
     * 设置google签名字符串
     *
     * @param signture google签名字符串
     */
    public void setSignture(String signture) {
        this.signture = signture;
    }

    /**
     * 获取google 签名的数据
     *
     * @return signture_data - google 签名的数据
     */
    public String getSigntureData() {
        return signtureData;
    }

    /**
     * 设置google 签名的数据
     *
     * @param signtureData google 签名的数据
     */
    public void setSigntureData(String signtureData) {
        this.signtureData = signtureData;
    }

    /**
     * 获取支付包名称
     *
     * @return package_name - 支付包名称
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置支付包名称
     *
     * @param packageName 支付包名称
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取用户支付token
     *
     * @return token - 用户支付token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置用户支付token
     *
     * @param token 用户支付token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取服务端请求验证结果 0 成功 1 通信失败
     *
     * @return result - 服务端请求验证结果 0 成功 1 通信失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置服务端请求验证结果 0 成功 1 通信失败
     *
     * @param result 服务端请求验证结果 0 成功 1 通信失败
     */
    public void setResult(Integer result) {
        this.result = result;
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


    public String getDataVerify() {
        return dataVerify;
    }

    public void setDataVerify(String dataVerify) {
        this.dataVerify = dataVerify;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userPayRecordId=").append(userPayRecordId);
        sb.append(", signture=").append(signture);
        sb.append(", signtureData=").append(signtureData);
        sb.append(", packageName=").append(packageName);
        sb.append(", productId=").append(productId);
        sb.append(", token=").append(token);
        sb.append(", result=").append(result);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}