package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_google_play_consume_result")
@ApiModel
public class GooglePlayConsumeResult implements Serializable {


    public GooglePlayConsumeResult() {
    }

    public GooglePlayConsumeResult(Integer userId, Integer googlePlayConsumeId, Integer result,
                                   Integer consumptionState, String developerPayload, String kind, Integer purchaseState, Long purchaseTimeMillis) {
        this.userId = userId;
        this.googlePlayConsumeId = googlePlayConsumeId;
        this.result = result;
        this.consumptionState = consumptionState;
        this.developerPayload = developerPayload;
        this.kind = kind;
        this.purchaseState = purchaseState;
        this.purchaseTimeMillis = purchaseTimeMillis;
    }

    public GooglePlayConsumeResult(Integer userId, Integer googlePlayConsumeId, Integer result) {
        this.userId = userId;
        this.googlePlayConsumeId = googlePlayConsumeId;
        this.result = result;
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
     * google支付凭证id
     */
    @Column(name = "google_play_consume_id")
    @ApiModelProperty(value="google支付凭证id")
    private Integer googlePlayConsumeId;

    /**
     * 请求结果 0 请求成功 1 请求失败
     */
    @ApiModelProperty(value="请求结果 0 请求成功 1 请求失败")
    private Integer result;

    /**
     * 产品的消费状态。可能的值是：0 还有待消费 1 消费
     */
    @Column(name = "consumption_state")
    @ApiModelProperty(value="产品的消费状态。可能的值是：0 还有待消费 1 消费")
    private Integer consumptionState;

    /**
     * 一个开发人员指定的字符串，其中包含有关订单的补充信息
     */
    @Column(name = "developer_payload")
    @ApiModelProperty(value="一个开发人员指定的字符串，其中包含有关订单的补充信息")
    private String developerPayload;

    /**
     * 这种表示androidpublisher服务中的一个inappPurchase对象
     */
    @ApiModelProperty(value="这种表示androidpublisher服务中的一个inappPurchase对象")
    private String kind;

    /**
     * 订单的采购状态。可能的值是：0 购买 1 取消
     */
    @Column(name = "purchase_state")
    @ApiModelProperty(value="订单的采购状态。可能的值是：0 购买 1 取消")
    private Integer purchaseState;

    /**
     * 用户支付token
     */
    @Column(name = "purchase_time_millis")
    @ApiModelProperty(value="用户支付token")
    private Long purchaseTimeMillis;

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
     * 获取google支付凭证id
     *
     * @return google_play_consume_id - google支付凭证id
     */
    public Integer getGooglePlayConsumeId() {
        return googlePlayConsumeId;
    }

    /**
     * 设置google支付凭证id
     *
     * @param googlePlayConsumeId google支付凭证id
     */
    public void setGooglePlayConsumeId(Integer googlePlayConsumeId) {
        this.googlePlayConsumeId = googlePlayConsumeId;
    }

    /**
     * 获取请求结果 0 请求成功 1 请求失败
     *
     * @return result - 请求结果 0 请求成功 1 请求失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置请求结果 0 请求成功 1 请求失败
     *
     * @param result 请求结果 0 请求成功 1 请求失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取产品的消费状态。可能的值是：0 还有待消费 1 消费
     *
     * @return consumption_state - 产品的消费状态。可能的值是：0 还有待消费 1 消费
     */
    public Integer getConsumptionState() {
        return consumptionState;
    }

    /**
     * 设置产品的消费状态。可能的值是：0 还有待消费 1 消费
     *
     * @param consumptionState 产品的消费状态。可能的值是：0 还有待消费 1 消费
     */
    public void setConsumptionState(Integer consumptionState) {
        this.consumptionState = consumptionState;
    }

    /**
     * 获取一个开发人员指定的字符串，其中包含有关订单的补充信息
     *
     * @return developer_payload - 一个开发人员指定的字符串，其中包含有关订单的补充信息
     */
    public String getDeveloperPayload() {
        return developerPayload;
    }

    /**
     * 设置一个开发人员指定的字符串，其中包含有关订单的补充信息
     *
     * @param developerPayload 一个开发人员指定的字符串，其中包含有关订单的补充信息
     */
    public void setDeveloperPayload(String developerPayload) {
        this.developerPayload = developerPayload;
    }

    /**
     * 获取这种表示androidpublisher服务中的一个inappPurchase对象
     *
     * @return kind - 这种表示androidpublisher服务中的一个inappPurchase对象
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置这种表示androidpublisher服务中的一个inappPurchase对象
     *
     * @param kind 这种表示androidpublisher服务中的一个inappPurchase对象
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 获取订单的采购状态。可能的值是：0 购买 1 取消
     *
     * @return purchase_state - 订单的采购状态。可能的值是：0 购买 1 取消
     */
    public Integer getPurchaseState() {
        return purchaseState;
    }

    /**
     * 设置订单的采购状态。可能的值是：0 购买 1 取消
     *
     * @param purchaseState 订单的采购状态。可能的值是：0 购买 1 取消
     */
    public void setPurchaseState(Integer purchaseState) {
        this.purchaseState = purchaseState;
    }

    /**
     * 获取用户支付token
     *
     * @return purchase_time_millis - 用户支付token
     */
    public Long getPurchaseTimeMillis() {
        return purchaseTimeMillis;
    }

    /**
     * 设置用户支付token
     *
     * @param purchaseTimeMillis 用户支付token
     */
    public void setPurchaseTimeMillis(Long purchaseTimeMillis) {
        this.purchaseTimeMillis = purchaseTimeMillis;
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
        sb.append(", googlePlayConsumeId=").append(googlePlayConsumeId);
        sb.append(", result=").append(result);
        sb.append(", consumptionState=").append(consumptionState);
        sb.append(", developerPayload=").append(developerPayload);
        sb.append(", kind=").append(kind);
        sb.append(", purchaseState=").append(purchaseState);
        sb.append(", purchaseTimeMillis=").append(purchaseTimeMillis);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}