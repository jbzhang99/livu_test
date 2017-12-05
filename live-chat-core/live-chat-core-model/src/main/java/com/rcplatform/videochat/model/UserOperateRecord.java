package com.rcplatform.videochat.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fj on 2017/11/13.
 */

@Table(name = "rc_user_operate_record")
public class UserOperateRecord {

    public UserOperateRecord() {
    }

    public UserOperateRecord(Integer userId, String userName, String operateTable, String beforeOperate, String afterOperate,Integer operateStatus) {
        this.userId = userId;
        this.userName = userName;
        this.operateTable = operateTable;
        this.beforeOperate = beforeOperate;
        this.afterOperate = afterOperate;
        this.operateStatus = operateStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    /**
     * 操作表
     */
    @Column(name = "operate_table")
    private String operateTable;

    /**
     * 操作前记录
     */
    @Column(name = "before_operate")
    private String beforeOperate;

    /**
     * 操作后记录
     */
    @Column(name = "after_operate")
    private String afterOperate;

    @Column(name = "create_time")
    private Date createTime;

    private Integer operateStatus;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取操作表
     *
     * @return operate_table - 操作表
     */
    public String getOperateTable() {
        return operateTable;
    }

    /**
     * 设置操作表
     *
     * @param operateTable 操作表
     */
    public void setOperateTable(String operateTable) {
        this.operateTable = operateTable;
    }

    /**
     * 获取操作前记录
     *
     * @return before_operate - 操作前记录
     */
    public String getBeforeOperate() {
        return beforeOperate;
    }

    /**
     * 设置操作前记录
     *
     * @param beforeOperate 操作前记录
     */
    public void setBeforeOperate(String beforeOperate) {
        this.beforeOperate = beforeOperate;
    }

    /**
     * 获取操作后记录
     *
     * @return after_operate - 操作后记录
     */
    public String getAfterOperate() {
        return afterOperate;
    }

    /**
     * 设置操作后记录
     *
     * @param afterOperate 操作后记录
     */
    public void setAfterOperate(String afterOperate) {
        this.afterOperate = afterOperate;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
    }
}