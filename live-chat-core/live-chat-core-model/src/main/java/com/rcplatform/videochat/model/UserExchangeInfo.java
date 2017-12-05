package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_exchange_info")
@ApiModel
public class UserExchangeInfo implements Serializable {
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
     * 兑换邮箱地址
     */
    @ApiModelProperty(value="兑换邮箱地址")
    private String email;

    /**
     * payPal账号
     */
    @Column(name = "pay_pal_account")
    @ApiModelProperty(value="payPal账号")
    private String payPalAccount;

    /**
     * firstName
     */
    @Column(name = "first_name")
    @ApiModelProperty(value="firstName")
    private String firstName;

    /**
     * last name
     */
    @Column(name = "last_name")
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
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

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
     * 获取兑换邮箱地址
     *
     * @return email - 兑换邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置兑换邮箱地址
     *
     * @param email 兑换邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取payPal账号
     *
     * @return pay_pal_account - payPal账号
     */
    public String getPayPalAccount() {
        return payPalAccount;
    }

    /**
     * 设置payPal账号
     *
     * @param payPalAccount payPal账号
     */
    public void setPayPalAccount(String payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    /**
     * 获取firstName
     *
     * @return first_name - firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName
     *
     * @param firstName firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 获取last name
     *
     * @return last_name - last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置last name
     *
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", email=").append(email);
        sb.append(", payPalAccount=").append(payPalAccount);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", country=").append(country);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}