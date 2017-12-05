package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ApiModel
@Table(name = "rc_praise_change_record")
public class PraiseChangeRecord implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 礼物id
     */
    @Column(name = "gift_id")
    private Integer giftId;

    /**
     * 礼物名称
     */
    @Column(name = "gift_name")
    private String giftName;

    private String email;

    private String mobile;

    private String country;

    private String address;

    /**
     * 邮编
     */
    @ApiModelProperty(value = "邮编")
    @Column(name = "post_code")
    private String postCode;

    /**
     * 所需赞数
     */
    @ApiModelProperty(value = "所需赞数")
    @Column(name = "praise_num")
    private Integer praiseNum;

    /**
     * 单号
     */
    @ApiModelProperty(value = "单号，服务端手动添加")
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 0:申请 1:已发货
     */
    private Integer status;

    /**
     * 0:未完成 1:完成
     */
    private Integer complete;

    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return user_id -
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return user_name -
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**

     *
     * @return gift_id -
     */
    public Integer getGiftId() {
        return giftId;
    }

    /**
     *
     *
     * @param giftId
     */
    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    /**
     *
     *
     * @return gift_name -
     */
    public String getGiftName() {
        return giftName;
    }

    /**
     *
     *
     * @param giftName
     */
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return post_code -
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     *
     * @param postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     *
     * @return praise_num
     */
    public Integer getPraiseNum() {
        return praiseNum;
    }

    /**
     *
     * @param praiseNum
     */
    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    /**
     *
     * @return order_number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**

     *
     * @return status -
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}