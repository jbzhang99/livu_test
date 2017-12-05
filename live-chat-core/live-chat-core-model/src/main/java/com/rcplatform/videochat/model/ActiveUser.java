package com.rcplatform.videochat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 药耀源 on 2017/4/25.
 */
@Table(name = "rc_active_user")
public class ActiveUser implements Serializable {
    public ActiveUser() {
    }


    public ActiveUser(Integer userId) {
        this.userId = userId;
    }


    public ActiveUser(Integer id, Date loginTime) {
        this.id = id;
        this.loginTime = loginTime;
    }

    public ActiveUser(Integer id, Integer selected) {
        this.id = id;
        this.selected = selected;
    }


    public ActiveUser(Integer userId, Integer gender, Integer age, Integer countryId, String languageId) {
        this.userId = userId;
        this.gender = gender;
        this.age = age;
        this.countryId = countryId;
        this.languageId = languageId;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;
    /**
     * 性别
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 国家ID
     */
    @Column(name = "country_id")
    private Integer countryId;

    /**
     * 语言ID列表
     */
    @Column(name = "language_id")
    private String languageId;

    /**
     * 最新登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 是否运营选择
     */
    @Column(name = "selected")
    private Integer selected;




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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public static final class Builder {
        private Integer id;
        private Integer userId;
        private Integer gender;
        private Integer age;
        private Integer countryId;
        private String languageId;
        private Date loginTime;
        private Integer selected;

        public Builder() {
        }



        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder countryId(Integer countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder languageId(String languageId) {
            this.languageId = languageId;
            return this;
        }

        public Builder loginTime(Date loginTime) {
            this.loginTime = loginTime;
            return this;
        }

        public Builder selected(Integer selected) {
            this.selected = selected;
            return this;
        }

        public ActiveUser build() {
            ActiveUser activeUser = new ActiveUser();
            activeUser.setId(id);
            activeUser.setUserId(userId);
            activeUser.setGender(gender);
            activeUser.setAge(age);
            activeUser.setCountryId(countryId);
            activeUser.setLanguageId(languageId);
            activeUser.setLoginTime(loginTime);
            activeUser.setSelected(selected);
            return activeUser;
        }
    }
}
