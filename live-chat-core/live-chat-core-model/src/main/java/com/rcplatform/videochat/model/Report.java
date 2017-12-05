package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_report")
@ApiModel
public class Report implements Serializable {

    public Report() {
    }

    public Report(Integer isHandle) {
        this.isHandle = isHandle;
    }

    public Report(Integer reportPage, Integer isHandle) {
        this.reportPage = reportPage;
        this.isHandle = isHandle;
    }

    public Report(Integer id,Integer isHandle, Integer result, String description, Date handleTime) {
        this.id = id;
        this.isHandle = isHandle;
        this.result = result;
        this.description = description;
        this.handleTime = handleTime;
    }
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(value="主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_id")
    @ApiModelProperty(value="")
    private Integer appId;

    /**
     * 举报人的id
     */
    @Column(name = "report_user_id")
    @ApiModelProperty(value="举报人的id")
    private Integer reportUserId;

    /**
     * 被举报人的id
     */
    @Column(name = "reported_user_id")
    @ApiModelProperty(value="被举报人的id")
    private Integer reportedUserId;

    /**
     * 举报的截图
     */
    @Column(name = "report_img")
    @ApiModelProperty(value="举报的截图")
    private String reportImg;

    /**
     * 举报信息时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="举报信息时间")
    private Date createTime;

    /**
     * 是否已处理 1 未处理 2 已处理
     */
    @Column(name = "is_handle")
    @ApiModelProperty(value="是否已处理 1 未处理 2 已处理")
    private Integer isHandle;

    /**
     * 处理结果 1 接受举报，2.不接受举报
     */
    @ApiModelProperty(value="处理结果 1 接受举报，2.不接受举报")
    private Integer result;

    /**
     * 处理结果的描述
     */
    @ApiModelProperty(value="处理结果的描述")
    private String description;

    /**
     * 被举报的页面 1 视频聊天 2 个人主页
     */
    @Column(name = "report_page")
    @ApiModelProperty(value="被举报的页面 1 视频聊天 2 个人主页")
    private Integer reportPage;

    /**
     * 处理的时间
     */
    @Column(name = "handle_time")
    @ApiModelProperty(value="处理的时间")
    private Date handleTime;

    /**
     * 1,删除头像，2 删除背景 3 全部删除 4,不处理
     */
    @Column(name = "handle_way")
    @ApiModelProperty(value="1,删除头像，2 删除背景 3 全部删除 4,不处理")
    private Integer handleWay;

    /**
     * 举报原因 1,性别不符，2 行为不当
     */
    @Column(name = "report_reason")
    @ApiModelProperty(value="举报原因 1,性别不符，2 行为不当")
    private Integer reportReason;

    @Column(name = "violations_rate")
    @ApiModelProperty(value = "黄图概率")
    private Double violationsRate;

    @Column(name = "violations_review")
    @ApiModelProperty(value = "黄图是否需要复审")
    private Integer violationsReview;

    @Column(name = "violations_label")
    @ApiModelProperty(value = "0：色情； 1：性感； 2：正常；")
    private Integer violationsLabel;

    @Column(name = "gender_rate")
    @ApiModelProperty(value = "性别概率")
    private Double genderRate;


    @Column(name = "gender_review")
    @ApiModelProperty(value = "性别不付是否需要要复审")
    private Integer genderReview;


    @Column(name = "gender_label")
    @ApiModelProperty(value = "0：一个老年男人； 1：一个老年女人； 2：一个青年男人； 3：一个青年女人； 4：一个小男孩； 5：一个小女孩； 6：一个婴儿； 7：多个老年男人； 8：多个老年女人； 9：多个老年男女； 10：多个青年男人； 11：多个青年女人； 12：多个青年男女； 13：多个小男孩； 14：多个小女孩； 15：多个小男孩和小女孩； 16：多个婴儿； 17：多个男人和女人； 18：多个男人； 19：多个女人； 20：没有人； 21：一个中年男人； 22：一个中年女人； 23：多个中年男人； 24：多个中年女人； 25：多个中年男女；")
    private Integer genderLabel;



    private Integer person;


    private Integer eroticism;

    /**
     * 0 未付费，1付费
     */
    private Integer payStatus;

    /**
     * 1 男 ,2 女
     */
    private Integer gender;


    /**
     * 用户级别id
     */
    @Column(name = "user_level_id")
    private Integer userLevelId;

    private Boolean userEroticism;

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
     * @return app_id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取举报人的id
     *
     * @return report_user_id - 举报人的id
     */
    public Integer getReportUserId() {
        return reportUserId;
    }

    /**
     * 设置举报人的id
     *
     * @param reportUserId 举报人的id
     */
    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    /**
     * 获取被举报人的id
     *
     * @return reported_user_id - 被举报人的id
     */
    public Integer getReportedUserId() {
        return reportedUserId;
    }

    /**
     * 设置被举报人的id
     *
     * @param reportedUserId 被举报人的id
     */
    public void setReportedUserId(Integer reportedUserId) {
        this.reportedUserId = reportedUserId;
    }

    /**
     * 获取举报的截图
     *
     * @return report_img - 举报的截图
     */
    public String getReportImg() {
        return reportImg;
    }

    /**
     * 设置举报的截图
     *
     * @param reportImg 举报的截图
     */
    public void setReportImg(String reportImg) {
        this.reportImg = reportImg;
    }

    /**
     * 获取举报信息时间
     *
     * @return create_time - 举报信息时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置举报信息时间
     *
     * @param createTime 举报信息时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否已处理 1 未处理 2 已处理
     *
     * @return is_handle - 是否已处理 1 未处理 2 已处理
     */
    public Integer getIsHandle() {
        return isHandle;
    }

    /**
     * 设置是否已处理 1 未处理 2 已处理
     *
     * @param isHandle 是否已处理 1 未处理 2 已处理
     */
    public void setIsHandle(Integer isHandle) {
        this.isHandle = isHandle;
    }

    /**
     * 获取处理结果 1 接受举报，2.不接受举报
     *
     * @return result - 处理结果 1 接受举报，2.不接受举报
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置处理结果 1 接受举报，2.不接受举报
     *
     * @param result 处理结果 1 接受举报，2.不接受举报
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取处理结果的描述
     *
     * @return description - 处理结果的描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置处理结果的描述
     *
     * @param description 处理结果的描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取被举报的页面 1 视频聊天 2 个人主页
     *
     * @return report_page - 被举报的页面 1 视频聊天 2 个人主页
     */
    public Integer getReportPage() {
        return reportPage;
    }

    /**
     * 设置被举报的页面 1 视频聊天 2 个人主页
     *
     * @param reportPage 被举报的页面 1 视频聊天 2 个人主页
     */
    public void setReportPage(Integer reportPage) {
        this.reportPage = reportPage;
    }

    /**
     * 获取处理的时间
     *
     * @return handle_time - 处理的时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置处理的时间
     *
     * @param handleTime 处理的时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 获取1,删除头像，2 删除背景 3 全部删除 4,不处理
     *
     * @return handle_way - 1,删除头像，2 删除背景 3 全部删除 4,不处理
     */
    public Integer getHandleWay() {
        return handleWay;
    }

    /**
     * 设置1,删除头像，2 删除背景 3 全部删除 4,不处理
     *
     * @param handleWay 1,删除头像，2 删除背景 3 全部删除 4,不处理
     */
    public void setHandleWay(Integer handleWay) {
        this.handleWay = handleWay;
    }

    /**
     * 获取举报原因 1,性别不符，2 行为不当
     *
     * @return report_reason - 举报原因 1,性别不符，2 行为不当
     */
    public Integer getReportReason() {
        return reportReason;
    }

    /**
     * 设置举报原因 1,性别不符，2 行为不当
     *
     * @param reportReason 举报原因 1,性别不符，2 行为不当
     */
    public void setReportReason(Integer reportReason) {
        this.reportReason = reportReason;
    }


    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    public Integer getEroticism() {
        return eroticism;
    }

    public void setEroticism(Integer eroticism) {
        this.eroticism = eroticism;
    }


    public Double getViolationsRate() {
        return violationsRate;
    }

    public void setViolationsRate(Double violationsRate) {
        this.violationsRate = violationsRate;
    }

    public Integer getViolationsReview() {
        return violationsReview;
    }

    public void setViolationsReview(Integer violationsReview) {
        this.violationsReview = violationsReview;
    }

    public Integer getViolationsLabel() {
        return violationsLabel;
    }

    public void setViolationsLabel(Integer violationsLabel) {
        this.violationsLabel = violationsLabel;
    }

    public Double getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(Double genderRate) {
        this.genderRate = genderRate;
    }

    public Integer getGenderReview() {
        return genderReview;
    }

    public void setGenderReview(Integer genderReview) {
        this.genderReview = genderReview;
    }

    public Integer getGenderLabel() {
        return genderLabel;
    }

    public void setGenderLabel(Integer genderLabel) {
        this.genderLabel = genderLabel;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }



    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Boolean getUserEroticism() {
        return userEroticism;
    }

    public void setUserEroticism(Boolean userEroticism) {
        this.userEroticism = userEroticism;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Report{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", reportUserId=").append(reportUserId);
        sb.append(", reportedUserId=").append(reportedUserId);
        sb.append(", reportImg='").append(reportImg).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", isHandle=").append(isHandle);
        sb.append(", result=").append(result);
        sb.append(", description='").append(description).append('\'');
        sb.append(", reportPage=").append(reportPage);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", handleWay=").append(handleWay);
        sb.append(", reportReason=").append(reportReason);
        sb.append(", violationsRate=").append(violationsRate);
        sb.append(", violationsReview=").append(violationsReview);
        sb.append(", violationsLabel=").append(violationsLabel);
        sb.append(", genderRate=").append(genderRate);
        sb.append(", genderReview=").append(genderReview);
        sb.append(", genderLabel=").append(genderLabel);
        sb.append(", person=").append(person);
        sb.append(", eroticism=").append(eroticism);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", gender=").append(gender);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append('}');
        return sb.toString();
    }
}