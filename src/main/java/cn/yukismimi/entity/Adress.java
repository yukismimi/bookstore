package cn.yukismimi.entity;


public class Adress {

  private String userId;
  private String province;
  private String city;
  private String dictrict;
  private long zipcode;
  private String adressDetail;
  private String receiverName;
  private long receiverPhoneNumber;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

}
