package com.rcplatform.videochat.model;

/**
 * Created by fj on 2017/11/8.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@ApiModel
@Table(name = "rc_praise_gift")
public class PraiseGift implements Serializable{

    public PraiseGift(Integer status) {
        this.status = status;
    }

    public PraiseGift() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "礼物名称")
    private String name;

    /**
     * 图片
     */
    @ApiModelProperty(value = "图片")
    private String url;

    /**
     * 所需赞数
     */
    @ApiModelProperty(value = "所需赞数")
    @Column(name = "praise_num")
    private Integer praiseNum;

    /**
     * 申请兑换人数
     */
    @ApiModelProperty(value = "申请兑换人数 暂时不用")
    @Column(name = "apply_change_person")
    private Integer applyChangePerson;

    /**
     * 已经兑换人数
     */
    @ApiModelProperty(value = "已经兑换人数")
    @Column(name = "changed_person")
    private Integer changedPerson;

    /**
     * 顺序
     */
    @ApiModelProperty(value = "顺序")
    private Integer orders;

    /**
     * 0未上架 1已上架
     */
    @ApiModelProperty(value = "0未上架 1已上架 默认获取已上架")
    private Integer status;

    /**
     * 国家
     */
    @ApiModelProperty(value = "国家")
    private String country;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图片
     *
     * @return url - 图片
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片
     *
     * @param url 图片
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取所需赞数
     *
     * @return praise_num - 所需赞数
     */
    public Integer getPraiseNum() {
        return praiseNum;
    }

    /**
     * 设置所需赞数
     *
     * @param praiseNum 所需赞数
     */
    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    /**
     * 获取申请兑换人数
     *
     * @return apply_change_person - 申请兑换人数
     */
    public Integer getApplyChangePerson() {
        return applyChangePerson;
    }

    /**
     * 设置申请兑换人数
     *
     * @param applyChangePerson 申请兑换人数
     */
    public void setApplyChangePerson(Integer applyChangePerson) {
        this.applyChangePerson = applyChangePerson;
    }

    /**
     * 获取已经兑换人数
     *
     * @return changed_person - 已经兑换人数
     */
    public Integer getChangedPerson() {
        return changedPerson;
    }

    /**
     * 设置已经兑换人数
     *
     * @param changedPerson 已经兑换人数
     */
    public void setChangedPerson(Integer changedPerson) {
        this.changedPerson = changedPerson;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取0未上架 1已上架
     *
     * @return status - 0未上架 1已上架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0未上架 1已上架
     *
     * @param status 0未上架 1已上架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}