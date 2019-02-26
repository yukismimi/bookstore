package cn.yukismimi.entity;


public class ShoppingCart {

  private String userId;
  private String id;
  private long amount;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getid() {
    return id;
  }

  public void setid(String id) {
    this.id = id;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

}
