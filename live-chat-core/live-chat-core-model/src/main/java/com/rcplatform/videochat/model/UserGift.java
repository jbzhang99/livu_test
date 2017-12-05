package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_user_gift")
@ApiModel
public class UserGift implements Serializable {

    public UserGift(Integer sendUserId, Integer receiveUserId, Integer giftId, BigDecimal gold, BigDecimal stone,
                    BigDecimal sendUserGold, BigDecimal receiveUserStone,Date createTime) {
        this.sendUserId = sendUserId;
        this.receiveUserId = receiveUserId;
        this.giftId = giftId;
        this.gold = gold;
        this.stone = stone;
        this.sendUserGold = sendUserGold;
        this.receiveUserStone = receiveUserStone;
        this.createTime = createTime;
    }

    public UserGift(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public UserGift() {
    }

    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 发送礼物用户id
     */
    @Column(name = "send_user_id")
    @ApiModelProperty(value="发送礼物用户id")
    private Integer sendUserId;

    /**
     * 收到礼物用户id
     */
    @Column(name = "receive_user_id")
    @ApiModelProperty(value="收到礼物用户id")
    private Integer receiveUserId;

    /**
     * 礼物id
     */
    @Column(name = "gift_id")
    @ApiModelProperty(value="礼物id")
    private Integer giftId;

    /**
     * 礼物金币数
     */
    @ApiModelProperty(value="礼物金币数")
    private BigDecimal gold;

    /**
     * 礼物钻石数
     */
    @ApiModelProperty(value="礼物钻石数")
    private BigDecimal stone;

    /**
     * 发送时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="发送时间")
    private Date createTime;

    /**
     * 发送礼物用户金币剩余
     */
    @Column(name = "send_user_gold")
    @ApiModelProperty(value="发送礼物用户金币剩余")
    private BigDecimal sendUserGold;

    /**
     * 收到礼物用户钻石剩余
     */
    @Column(name = "receive_user_stone")
    @ApiModelProperty(value="收到礼物用户钻石剩余")
    private BigDecimal receiveUserStone;

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
     * 获取发送礼物用户id
     *
     * @return send_user_id - 发送礼物用户id
     */
    public Integer getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置发送礼物用户id
     *
     * @param sendUserId 发送礼物用户id
     */
    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取收到礼物用户id
     *
     * @return receive_user_id - 收到礼物用户id
     */
    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    /**
     * 设置收到礼物用户id
     *
     * @param receiveUserId 收到礼物用户id
     */
    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    /**
     * 获取礼物id
     *
     * @return gift_id - 礼物id
     */
    public Integer getGiftId() {
        return giftId;
    }

    /**
     * 设置礼物id
     *
     * @param giftId 礼物id
     */
    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    /**
     * 获取礼物金币数
     *
     * @return gold - 礼物金币数
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置礼物金币数
     *
     * @param gold 礼物金币数
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    /**
     * 获取礼物钻石数
     *
     * @return stone - 礼物钻石数
     */
    public BigDecimal getStone() {
        return stone;
    }

    /**
     * 设置礼物钻石数
     *
     * @param stone 礼物钻石数
     */
    public void setStone(BigDecimal stone) {
        this.stone = stone;
    }

    /**
     * 获取发送时间
     *
     * @return create_time - 发送时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置发送时间
     *
     * @param createTime 发送时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取发送礼物用户金币剩余
     *
     * @return send_user_gold - 发送礼物用户金币剩余
     */
    public BigDecimal getSendUserGold() {
        return sendUserGold;
    }

    /**
     * 设置发送礼物用户金币剩余
     *
     * @param sendUserGold 发送礼物用户金币剩余
     */
    public void setSendUserGold(BigDecimal sendUserGold) {
        this.sendUserGold = sendUserGold;
    }

    /**
     * 获取收到礼物用户钻石剩余
     *
     * @return receive_user_stone - 收到礼物用户钻石剩余
     */
    public BigDecimal getReceiveUserStone() {
        return receiveUserStone;
    }

    /**
     * 设置收到礼物用户钻石剩余
     *
     * @param receiveUserStone 收到礼物用户钻石剩余
     */
    public void setReceiveUserStone(BigDecimal receiveUserStone) {
        this.receiveUserStone = receiveUserStone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append(", receiveUserId=").append(receiveUserId);
        sb.append(", giftId=").append(giftId);
        sb.append(", gold=").append(gold);
        sb.append(", stone=").append(stone);
        sb.append(", createTime=").append(createTime);
        sb.append(", sendUserGold=").append(sendUserGold);
        sb.append(", receiveUserStone=").append(receiveUserStone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}