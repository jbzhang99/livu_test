package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_google_play_sub_result_detail")
@ApiModel
public class GooglePlaySubResultDetail implements Serializable {
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
     * google play 订阅信息id
     */
    @Column(name = "google_play_sub_id")
    @ApiModelProperty(value="google play 订阅信息id")
    private Integer googlePlaySubId;

    /**
     * 订阅是否在达到当前到期时间后自动更新
     */
    @Column(name = "auto_renewing")
    @ApiModelProperty(value="订阅是否在达到当前到期时间后自动更新")
    private Integer autoRenewing;

    /**
     * 订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题
     */
    @Column(name = "cancel_reason")
    @ApiModelProperty(value="订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题")
    private Integer cancelReason;

    /**
     * 授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。
     */
    @Column(name = "country_code")
    @ApiModelProperty(value="授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。")
    private String countryCode;

    /**
     * 一个开发人员指定的字符串，其中包含有关订单的补充信息
     */
    @Column(name = "developer_payload")
    @ApiModelProperty(value="一个开发人员指定的字符串，其中包含有关订单的补充信息")
    private String developerPayload;

    /**
     * 订阅期满后的时间，自时代以来的毫秒
     */
    @Column(name = "expiry_time_millis")
    @ApiModelProperty(value="订阅期满后的时间，自时代以来的毫秒")
    private Long expiryTimeMillis;

    /**
     * 这种类型表示androidpublisher服务中的subscriptionPurchase对象
     */
    @ApiModelProperty(value="这种类型表示androidpublisher服务中的subscriptionPurchase对象")
    private String kind;

    /**
     * 订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用
     */
    @Column(name = "payment_state")
    @ApiModelProperty(value="订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用")
    private Integer paymentState;

    /**
     * 认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。
     */
    @Column(name = "price_amount_micros")
    @ApiModelProperty(value="认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。")
    private Long priceAmountMicros;

    /**
     * 订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是"GBP"
     */
    @Column(name = "price_currency_code")
    @ApiModelProperty(value="订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是GBP")
    private String priceCurrencyCode;

    /**
     * 授予订阅的时间，自纪元以来的毫秒
     */
    @Column(name = "start_time_millis")
    @ApiModelProperty(value="授予订阅的时间，自纪元以来的毫秒")
    private Long startTimeMillis;

    /**
     * 用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现
     */
    @Column(name = "user_cancellation_time_millis")
    @ApiModelProperty(value="用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现")
    private Long userCancellationTimeMillis;

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
     * 获取google play 订阅信息id
     *
     * @return google_play_sub_id - google play 订阅信息id
     */
    public Integer getGooglePlaySubId() {
        return googlePlaySubId;
    }

    /**
     * 设置google play 订阅信息id
     *
     * @param googlePlaySubId google play 订阅信息id
     */
    public void setGooglePlaySubId(Integer googlePlaySubId) {
        this.googlePlaySubId = googlePlaySubId;
    }

    /**
     * 获取订阅是否在达到当前到期时间后自动更新
     *
     * @return auto_renewing - 订阅是否在达到当前到期时间后自动更新
     */
    public Integer getAutoRenewing() {
        return autoRenewing;
    }

    /**
     * 设置订阅是否在达到当前到期时间后自动更新
     *
     * @param autoRenewing 订阅是否在达到当前到期时间后自动更新
     */
    public void setAutoRenewing(Integer autoRenewing) {
        this.autoRenewing = autoRenewing;
    }

    /**
     * 获取订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题
     *
     * @return cancel_reason - 订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题
     */
    public Integer getCancelReason() {
        return cancelReason;
    }

    /**
     * 设置订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题
     *
     * @param cancelReason 订阅被取消或不是自动更新的原因。可能的值是：0 用户取消订阅 1 订单被系统取消，例如因为计费问题
     */
    public void setCancelReason(Integer cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * 获取授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。
     *
     * @return country_code - 授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。
     *
     * @param countryCode 授权时用户的ISO 3166-1 alpha-2计费国家/地区代码。
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
     * 获取订阅期满后的时间，自时代以来的毫秒
     *
     * @return expiry_time_millis - 订阅期满后的时间，自时代以来的毫秒
     */
    public Long getExpiryTimeMillis() {
        return expiryTimeMillis;
    }

    /**
     * 设置订阅期满后的时间，自时代以来的毫秒
     *
     * @param expiryTimeMillis 订阅期满后的时间，自时代以来的毫秒
     */
    public void setExpiryTimeMillis(Long expiryTimeMillis) {
        this.expiryTimeMillis = expiryTimeMillis;
    }

    /**
     * 获取这种类型表示androidpublisher服务中的subscriptionPurchase对象
     *
     * @return kind - 这种类型表示androidpublisher服务中的subscriptionPurchase对象
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置这种类型表示androidpublisher服务中的subscriptionPurchase对象
     *
     * @param kind 这种类型表示androidpublisher服务中的subscriptionPurchase对象
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 获取订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用
     *
     * @return payment_state - 订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用
     */
    public Integer getPaymentState() {
        return paymentState;
    }

    /**
     * 设置订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用
     *
     * @param paymentState 订阅的付款状态。可能的值是：0 付款等待中 1 已收到付款 2 免费试用
     */
    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    /**
     * 获取认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。
     *
     * @return price_amount_micros - 认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。
     */
    public Long getPriceAmountMicros() {
        return priceAmountMicros;
    }

    /**
     * 设置认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。
     *
     * @param priceAmountMicros 认购价格，不含税。价格以微型单位表示，其中1,000,000个微单位是货币的一个单位。例如，如果认购价为1.99€，price_amount_micros是1990000。
     */
    public void setPriceAmountMicros(Long priceAmountMicros) {
        this.priceAmountMicros = priceAmountMicros;
    }

    /**
     * 获取订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是"GBP"
     *
     * @return price_currency_code - 订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是"GBP"
     */
    public String getPriceCurrencyCode() {
        return priceCurrencyCode;
    }

    /**
     * 设置订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是"GBP"
     *
     * @param priceCurrencyCode 订阅价格为ISO 4217货币代码。例如，如果价格是以英镑计算的，price_currency_code就是"GBP"
     */
    public void setPriceCurrencyCode(String priceCurrencyCode) {
        this.priceCurrencyCode = priceCurrencyCode;
    }

    /**
     * 获取授予订阅的时间，自纪元以来的毫秒
     *
     * @return start_time_millis - 授予订阅的时间，自纪元以来的毫秒
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /**
     * 设置授予订阅的时间，自纪元以来的毫秒
     *
     * @param startTimeMillis 授予订阅的时间，自纪元以来的毫秒
     */
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    /**
     * 获取用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现
     *
     * @return user_cancellation_time_millis - 用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现
     */
    public Long getUserCancellationTimeMillis() {
        return userCancellationTimeMillis;
    }

    /**
     * 设置用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现
     *
     * @param userCancellationTimeMillis 用户取消订阅的时间，从时代开始以毫秒为单位。仅当cancelReason为0时才出现
     */
    public void setUserCancellationTimeMillis(Long userCancellationTimeMillis) {
        this.userCancellationTimeMillis = userCancellationTimeMillis;
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
        sb.append(", googlePlaySubId=").append(googlePlaySubId);
        sb.append(", autoRenewing=").append(autoRenewing);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", developerPayload=").append(developerPayload);
        sb.append(", expiryTimeMillis=").append(expiryTimeMillis);
        sb.append(", kind=").append(kind);
        sb.append(", paymentState=").append(paymentState);
        sb.append(", priceAmountMicros=").append(priceAmountMicros);
        sb.append(", priceCurrencyCode=").append(priceCurrencyCode);
        sb.append(", startTimeMillis=").append(startTimeMillis);
        sb.append(", userCancellationTimeMillis=").append(userCancellationTimeMillis);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}