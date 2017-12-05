package com.rcplatform.videochat.model;

import java.math.BigDecimal;

/**
 * Created by 药耀源 on 2017/3/30.
 */
public class UserStoneDetail {

  public UserStoneDetail() {
  }

  private Integer id;

  private String userName;

  private String headImg;

  private String background;

  private BigDecimal receiveTotal;

  private BigDecimal totalStone;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }

  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  public BigDecimal getReceiveTotal() {
    return receiveTotal;
  }

  public void setReceiveTotal(BigDecimal receiveTotal) {
    this.receiveTotal = receiveTotal;
  }

  public BigDecimal getTotalStone() {
    return totalStone;
  }

  public void setTotalStone(BigDecimal totalStone) {
    this.totalStone = totalStone;
  }
}
