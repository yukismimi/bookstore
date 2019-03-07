package cn.yukismimi.entity;


import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Alias("transaction")
public class Transaction {

  private String orderNo;
  private LocalDateTime orderTime;
  private int orderStatus;
  private int bookId;
  private int userId;
  private String bookName;
  private double unitPrice;
  private double totalPrice;
  private int amount;
  private String province;
  private String city;
  private String dictrict;
  private long zipcode;
  private String adressDetail;
  private String receiverName;
  private long receiverPhoneNumber;
  private String otherMessage;
  private int deleteFlag;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public LocalDateTime getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(LocalDateTime orderTime) {
    this.orderTime = orderTime;
  }

  public int getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(int orderStatus) {
    this.orderStatus = orderStatus;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDictrict() {
    return dictrict;
  }

  public void setDictrict(String dictrict) {
    this.dictrict = dictrict;
  }

  public long getZipcode() {
    return zipcode;
  }

  public void setZipcode(long zipcode) {
    this.zipcode = zipcode;
  }

  public String getAdressDetail() {
    return adressDetail;
  }

  public void setAdressDetail(String adressDetail) {
    this.adressDetail = adressDetail;
  }

  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public long getReceiverPhoneNumber() {
    return receiverPhoneNumber;
  }

  public void setReceiverPhoneNumber(long receiverPhoneNumber) {
    this.receiverPhoneNumber = receiverPhoneNumber;
  }

  public String getOtherMessage() {
    return otherMessage;
  }

  public void setOtherMessage(String otherMessage) {
    this.otherMessage = otherMessage;
  }

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
