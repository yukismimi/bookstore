package cn.yukismimi.entity;


public class RechargeRecord {

  private String rechargeNo;
  private String id;
  private java.sql.Timestamp rechargeTime;
  private long rechargeStatus;
  private long deleteFlag;


  public String getRechargeNo() {
    return rechargeNo;
  }

  public void setRechargeNo(String rechargeNo) {
    this.rechargeNo = rechargeNo;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public java.sql.Timestamp getRechargeTime() {
    return rechargeTime;
  }

  public void setRechargeTime(java.sql.Timestamp rechargeTime) {
    this.rechargeTime = rechargeTime;
  }


  public long getRechargeStatus() {
    return rechargeStatus;
  }

  public void setRechargeStatus(long rechargeStatus) {
    this.rechargeStatus = rechargeStatus;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
