package com.rcplatform.videochat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_keep")

public class UserKeep implements Serializable {
    @Id
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    /**
     * 每日用户活跃总数
     */
    @Column(name = "dau_total")

    private Integer dauTotal;

    /**
     * 每日android用户活跃总数
     */
    @Column(name = "dau_android")

    private Integer dauAndroid;

    /**
     * 每日ios用户活跃总数
     */
    @Column(name = "dau_ios")

    private Integer dauIos;

    /**
     * 每日男性活跃总数
     */
    @Column(name = "dau_boy")

    private Integer dauBoy;

    /**
     * 每日女性活跃总数
     */
    @Column(name = "dau_girl")

    private Integer dauGirl;

    /**
     * 每日用户留存
     */
    @Column(name = "keep_total")

    private Integer keepTotal;

    /**
     * 每日android用户留存
     */
    @Column(name = "keep_android")

    private Integer keepAndroid;

    /**
     * 每日ios用户留存
     */
    @Column(name = "keep_ios")

    private Integer keepIos;

    /**
     * 每日男性用户留存
     */
    @Column(name = "keep_boy")

    private Integer keepBoy;

    /**
     * 每日女性用户留存
     */
    @Column(name = "keep_girl")

    private Integer keepGirl;

    @Column(name = "dua_android_boy")
    private Integer duaAndroidBoy;

    @Column(name = "dua_android_girl")
    private Integer duaAndroidGirl;

    @Column(name = "dua_ios_boy")
    private Integer duaIosBoy;

    @Column(name = "dua_ios_girl")
    private Integer duaIosGirl;

    @Column(name = "dua_android_boy_detail")
    private String duaAndroidBoyDetail;

    @Column(name = "dua_android_girl_detail")
    private String duaAndroidGirlDetail;

    @Column(name = "dua_ios_boy_detail")
    private String duaIosBoyDetail;

    @Column(name = "dua_ios_girl_detail")
    private String duaIosGirlDetail;

    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    private static final long serialVersionUID = 1L;

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
     * 获取每日用户活跃总数
     *
     * @return dau_total - 每日用户活跃总数
     */
    public Integer getDauTotal() {
        return dauTotal;
    }

    /**
     * 设置每日用户活跃总数
     *
     * @param dauTotal 每日用户活跃总数
     */
    public void setDauTotal(Integer dauTotal) {
        this.dauTotal = dauTotal;
    }

    /**
     * 获取每日android用户活跃总数
     *
     * @return dau_android - 每日android用户活跃总数
     */
    public Integer getDauAndroid() {
        return dauAndroid;
    }

    /**
     * 设置每日android用户活跃总数
     *
     * @param dauAndroid 每日android用户活跃总数
     */
    public void setDauAndroid(Integer dauAndroid) {
        this.dauAndroid = dauAndroid;
    }

    /**
     * 获取每日ios用户活跃总数
     *
     * @return dau_ios - 每日ios用户活跃总数
     */
    public Integer getDauIos() {
        return dauIos;
    }

    /**
     * 设置每日ios用户活跃总数
     *
     * @param dauIos 每日ios用户活跃总数
     */
    public void setDauIos(Integer dauIos) {
        this.dauIos = dauIos;
    }

    /**
     * 获取每日男性活跃总数
     *
     * @return dau_boy - 每日男性活跃总数
     */
    public Integer getDauBoy() {
        return dauBoy;
    }

    /**
     * 设置每日男性活跃总数
     *
     * @param dauBoy 每日男性活跃总数
     */
    public void setDauBoy(Integer dauBoy) {
        this.dauBoy = dauBoy;
    }

    /**
     * 获取每日女性活跃总数
     *
     * @return dau_girl - 每日女性活跃总数
     */
    public Integer getDauGirl() {
        return dauGirl;
    }

    /**
     * 设置每日女性活跃总数
     *
     * @param dauGirl 每日女性活跃总数
     */
    public void setDauGirl(Integer dauGirl) {
        this.dauGirl = dauGirl;
    }

    /**
     * 获取每日用户留存
     *
     * @return keep_total - 每日用户留存
     */
    public Integer getKeepTotal() {
        return keepTotal;
    }

    /**
     * 设置每日用户留存
     *
     * @param keepTotal 每日用户留存
     */
    public void setKeepTotal(Integer keepTotal) {
        this.keepTotal = keepTotal;
    }

    /**
     * 获取每日android用户留存
     *
     * @return keep_android - 每日android用户留存
     */
    public Integer getKeepAndroid() {
        return keepAndroid;
    }

    /**
     * 设置每日android用户留存
     *
     * @param keepAndroid 每日android用户留存
     */
    public void setKeepAndroid(Integer keepAndroid) {
        this.keepAndroid = keepAndroid;
    }

    /**
     * 获取每日ios用户留存
     *
     * @return keep_ios - 每日ios用户留存
     */
    public Integer getKeepIos() {
        return keepIos;
    }

    /**
     * 设置每日ios用户留存
     *
     * @param keepIos 每日ios用户留存
     */
    public void setKeepIos(Integer keepIos) {
        this.keepIos = keepIos;
    }

    /**
     * 获取每日男性用户留存
     *
     * @return keep_boy - 每日男性用户留存
     */
    public Integer getKeepBoy() {
        return keepBoy;
    }

    /**
     * 设置每日男性用户留存
     *
     * @param keepBoy 每日男性用户留存
     */
    public void setKeepBoy(Integer keepBoy) {
        this.keepBoy = keepBoy;
    }


    public Integer getKeepGirl() {
        return keepGirl;
    }

    public void setKeepGirl(Integer keepGirl) {
        this.keepGirl = keepGirl;
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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getDuaAndroidBoy() {
        return duaAndroidBoy;
    }

    public void setDuaAndroidBoy(Integer duaAndroidBoy) {
        this.duaAndroidBoy = duaAndroidBoy;
    }

    public Integer getDuaAndroidGirl() {
        return duaAndroidGirl;
    }

    public void setDuaAndroidGirl(Integer duaANdroidGirl) {
        this.duaAndroidGirl = duaANdroidGirl;
    }

    public Integer getDuaIosBoy() {
        return duaIosBoy;
    }

    public void setDuaIosBoy(Integer duaIosBoy) {
        this.duaIosBoy = duaIosBoy;
    }

    public Integer getDuaIosGirl() {
        return duaIosGirl;
    }

    public void setDuaIosGirl(Integer duaIosGirl) {
        this.duaIosGirl = duaIosGirl;
    }

    public String getDuaAndroidBoyDetail() {
        return duaAndroidBoyDetail;
    }

    public void setDuaAndroidBoyDetail(String duaAndroidBoyDetail) {
        this.duaAndroidBoyDetail = duaAndroidBoyDetail;
    }

    public String getDuaAndroidGirlDetail() {
        return duaAndroidGirlDetail;
    }

    public void setDuaAndroidGirlDetail(String duaAndroidGirlDetail) {
        this.duaAndroidGirlDetail = duaAndroidGirlDetail;
    }

    public String getDuaIosBoyDetail() {
        return duaIosBoyDetail;
    }

    public void setDuaIosBoyDetail(String duaIosBoyDetail) {
        this.duaIosBoyDetail = duaIosBoyDetail;
    }

    public String getDuaIosGirlDetail() {
        return duaIosGirlDetail;
    }

    public void setDuaIosGirlDetail(String duaIosGirlDetail) {
        this.duaIosGirlDetail = duaIosGirlDetail;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserKeep{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", dauTotal=").append(dauTotal);
        sb.append(", dauAndroid=").append(dauAndroid);
        sb.append(", dauIos=").append(dauIos);
        sb.append(", dauBoy=").append(dauBoy);
        sb.append(", dauGirl=").append(dauGirl);
        sb.append(", keepTotal=").append(keepTotal);
        sb.append(", keepAndroid=").append(keepAndroid);
        sb.append(", keepIos=").append(keepIos);
        sb.append(", keepBoy=").append(keepBoy);
        sb.append(", keepGirl=").append(keepGirl);
        sb.append(", duaAndroidBoy=").append(duaAndroidBoy);
        sb.append(", duaAndroidGirl=").append(duaAndroidGirl);
        sb.append(", duaIosBoy=").append(duaIosBoy);
        sb.append(", duaIosGirl=").append(duaIosGirl);
        sb.append(", duaAndroidBoyDetail='").append(duaAndroidBoyDetail).append('\'');
        sb.append(", duaAndroidGirlDetail='").append(duaAndroidGirlDetail).append('\'');
        sb.append(", duaIosBoyDetail='").append(duaIosBoyDetail).append('\'');
        sb.append(", duaIosGirlDetail='").append(duaIosGirlDetail).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}