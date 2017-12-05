package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_app_store_sub")
@ApiModel
public class AppStoreSub implements Serializable {
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
     * app store 交易id
     */
    @Column(name = "transaction_id")
    @ApiModelProperty(value="app store 交易id")
    private String transactionId;

    /**
     * 购买的所花的钱数
     */
    @ApiModelProperty(value="购买的所花的钱数")
    private BigDecimal money;

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
     * 获取购买的所花的钱数
     *
     * @return money - 购买的所花的钱数
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置购买的所花的钱数
     *
     * @param money 购买的所花的钱数
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
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
        sb.append(", transactionId=").append(transactionId);
        sb.append(", money=").append(money);
        sb.append(", createTime=").append(createTime);
        sb.append(", receiptData=").append(receiptData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}