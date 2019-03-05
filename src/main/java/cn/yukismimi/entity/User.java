package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

  private int id;
  private String userName;
  private long age;
  private long gender;
  private String mailAddress;
  private String password;
  private String otherInfo;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public String getMailAddress() {
    return mailAddress;
  }

  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getOtherInfo() {
    return otherInfo;
  }

  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }

}
