package com.rcplatform.livechat.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

import com.rcplatform.livechat.dto.request.admin.StatisticsReqDto;

import java.io.Serializable;

/**
 * Created by admin on 2017/2/13.
 */
public class ExchangeOrderDto   implements Serializable {

	private String beginDate;
	private String endDate;
    /**
     * 兑换商品id
     */
    @ApiModelProperty(value="兑换商品id")
    @NotNull
    private Integer exchangeCommodityId;


    /**
     * 兑换邮箱地址
     */
    @ApiModelProperty(value="兑换邮箱地址")
    private String email;

    /**
     * payPal账号
     */
    @ApiModelProperty(value="payPal账号")
    private String payPalAccount;

    /**
     * firstName
     */
    @ApiModelProperty(value="firstName")
    private String firstName;

    /**
     * last name
     */
    @ApiModelProperty(value="last name")
    private String lastName;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家")
    private String country;


    /**
     * 订单支持货币
     */
    @ApiModelProperty(value="订单支持货币")
    private String currency;
    
    
    /**
     * 订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     */
    @ApiModelProperty(value="订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成")
    private Integer orderAuditStatus;

    
    public Integer getOrderAuditStatus() {
		return orderAuditStatus;
	}

	public void setOrderAuditStatus(Integer orderAuditStatus) {
		this.orderAuditStatus = orderAuditStatus;
	}

	public Integer getExchangeCommodityId() {
        return exchangeCommodityId;
    }

    public void setExchangeCommodityId(Integer exchangeCommodityId) {
        this.exchangeCommodityId = exchangeCommodityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayPalAccount() {
        return payPalAccount;
    }

    public void setPayPalAccount(String payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExchangeOrderDto{");
        sb.append("exchangeCommodityId=").append(exchangeCommodityId);
        sb.append(", email='").append(email).append('\'');
        sb.append(", payPalAccount='").append(payPalAccount).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
