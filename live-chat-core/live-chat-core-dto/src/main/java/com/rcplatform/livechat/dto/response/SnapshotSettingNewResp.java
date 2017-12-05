package com.rcplatform.livechat.dto.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyuan on 2017/7/11.
 */
public class SnapshotSettingNewResp implements Serializable {

    public SnapshotSettingNewResp() {
    }

    private Integer gender;

    private List<Integer> snapshotTime;


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public List<Integer> getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(List<Integer> snapshotTime) {
        this.snapshotTime = snapshotTime;
    }
}
