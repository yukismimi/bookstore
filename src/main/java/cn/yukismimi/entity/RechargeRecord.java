package cn.yukismimi.entity;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("rechargeRecord")
public class RechargeRecord {

  private String rechargeNo;
  private int userId;
  private LocalDateTime rechargeTime;
  private double rechargeAmount;
  private int rechargeStatus;
  private int deleteFlag;


  public String getRechargeNo() {
    return rechargeNo;
  }

  public void setRechargeNo(String rechargeNo) {
    this.rechargeNo = rechargeNo;
  }

  public LocalDateTime getRechargeTime() {
    return rechargeTime;
  }

  public void setRechargeTime(LocalDateTime rechargeTime) {
    this.rechargeTime = rechargeTime;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public double getRechargeAmount() {
    return rechargeAmount;
  }

  public void setRechargeAmount(double rechargeAmount) {
    this.rechargeAmount = rechargeAmount;
  }

  public int getRechargeStatus() {
    return rechargeStatus;
  }

  public void setRechargeStatus(int rechargeStatus) {
    this.rechargeStatus = rechargeStatus;
  }

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
