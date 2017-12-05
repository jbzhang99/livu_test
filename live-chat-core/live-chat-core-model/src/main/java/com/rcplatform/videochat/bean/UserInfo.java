package com.rcplatform.videochat.bean;

import com.rcplatform.videochat.model.User;
import com.rcplatform.videochat.model.UserLocation;

/**
 * Created by admin on 2017/4/7.
 */
public class UserInfo {

    public UserInfo(User user) {
        this.user = user;
    }

    public UserInfo() {
    }

    private User user;


    private UserLocation userLocation;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfo{");
        sb.append("user=").append(user);
        sb.append(", userLocation=").append(userLocation);
        sb.append('}');
        return sb.toString();
    }
}
