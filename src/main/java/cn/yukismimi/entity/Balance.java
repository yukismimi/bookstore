package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("balance")
public class Balance {

  private long id;
  private double balance;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
