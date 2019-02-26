package cn.yukismimi.entity;


public class Transaction {

  private String orderNo;
  private java.sql.Timestamp orderTime;
  private long orderStatus;
  private String userId;
  private String id;
  private String bookName;
  private double unitPrice;
  private double totalPrice;
  private long amount;
  private String province;
  private String city;
  private String dictrict;
  private long zipcode;
  private String adressDetail;
  private String receiverName;
  private long receiverPhoneNumber;
  private String otherMessage;
  private long deleteFlag;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public java.sql.Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Timestamp orderTime) {
    this.orderTime = orderTime;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


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


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
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


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

}
