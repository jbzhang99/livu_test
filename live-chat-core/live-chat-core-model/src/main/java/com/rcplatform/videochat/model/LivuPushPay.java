package com.rcplatform.videochat.model;

import javax.persistence.*;

@Table(name = "rc_livu_push_pay")
public class LivuPushPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private Long money;

    private Integer times;

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
     * @return money
     */
    public Long getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
}