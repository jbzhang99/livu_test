package com.rcplatform.livechat.dto.response;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
public class ExchangeOrderResDto implements Serializable {

	 /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Integer id;
    
    /**
     * 用户id
     */
    @ApiModelProperty(value="用户id")
    private Integer userId;

	/**
     * 用户兑换前钻石数量
     */
    @ApiModelProperty(value="用户兑换前钻石数量")
    private BigDecimal userStone;
	
    /**
     * 兑换商品id
     */
    @ApiModelProperty(value="兑换商品id")
    private Integer exchangeCommodityId;

    /**
     * 消耗钻石数
     */
    @ApiModelProperty(value="消耗钻石数")
    private BigDecimal stone;

    /**
     * 兑换的金额
     */
    @ApiModelProperty(value="兑换的金额")
    private BigDecimal exchangeMoney;
    
    
    /**
     * 兑换商品类型 0 amazon卡 1 paypal
     */
    @ApiModelProperty(value="兑换商品类型 0 amazon卡 1 paypal")
    private Integer exchangeType;
    
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
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 发放时间
     */
    @ApiModelProperty(value="发放时间")
    private Date finishTime;

    /**
     * 完成时间
     */
    @ApiModelProperty(value="完成时间")
    private Date auditTime;

    /**
     * 订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成
     */
    @ApiModelProperty(value="订单审核状态 0 待审核 1 审核通过  2  已关闭  3 已完成")
    private Integer orderAuditStatus;

    /**
     * 订单支持货币
     */
    @ApiModelProperty(value="订单支持货币")
    private String currency;

    /**
     * 兑换商品名称
     */
    private String exchangeCommodityName;
    
    
    public String getExchangeCommodityName() {
		return exchangeCommodityName;
	}

	public void setExchangeCommodityName(String exchangeCommodityName) {
		this.exchangeCommodityName = exchangeCommodityName;
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


    public BigDecimal getUserStone() {
		return userStone;
	}

	public void setUserStone(BigDecimal userStone) {
		this.userStone = userStone;
	}

	public BigDecimal getStone() {
		return stone;
	}

	public void setStone(BigDecimal stone) {
		this.stone = stone;
	}

	public BigDecimal getExchangeMoney() {
		return exchangeMoney;
	}

	public void setExchangeMoney(BigDecimal exchangeMoney) {
		this.exchangeMoney = exchangeMoney;
	}

	public Integer getExchangeType() {
		return exchangeType;
	}

	public void setExchangeType(Integer exchangeType) {
		this.exchangeType = exchangeType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Integer getOrderAuditStatus() {
		return orderAuditStatus;
	}

	public void setOrderAuditStatus(Integer orderAuditStatus) {
		this.orderAuditStatus = orderAuditStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
