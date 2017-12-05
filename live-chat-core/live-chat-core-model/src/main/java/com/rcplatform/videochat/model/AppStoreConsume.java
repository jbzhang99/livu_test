package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_app_store_consume")
@ApiModel
public class AppStoreConsume implements Serializable {


    public AppStoreConsume() {
    }

    public AppStoreConsume(Integer userId, Integer userPayRecordId, String transactionId, Integer result, String receiptData) {
        this.userId = userId;
        this.userPayRecordId = userPayRecordId;
        this.transactionId = transactionId;
        this.result = result;
        this.receiptData = receiptData;
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
     * app store 交易id
     */
    @Column(name = "transaction_id")
    @ApiModelProperty(value="app store 交易id")
    private String transactionId;



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

    /**
     * app store 校验数据体
     */
    @Column(name = "receipt_data")
    @ApiModelProperty(value="app store 校验数据体")
    private String receiptData;

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
     * 获取app store 交易id
     *
     * @return transaction_id - app store 交易id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置app store 交易id
     *
     * @param transactionId app store 交易id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    /**
     * 获取app store 校验数据体
     *
     * @return receipt_data - app store 校验数据体
     */
    public String getReceiptData() {
        return receiptData;
    }

    /**
     * 设置app store 校验数据体
     *
     * @param receiptData app store 校验数据体
     */
    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
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
        sb.append(", transactionId=").append(transactionId);
        sb.append(", result=").append(result);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", receiptData=").append(receiptData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}