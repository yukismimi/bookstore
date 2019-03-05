package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("book")
public class Book {

  private int id;
  private String bookName;
  private String author;
  private double price;
  private long stock;
  private String press;
  private String otherInfo;
  private int onSellStatus;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public String getOtherInfo() {
    return otherInfo;
  }

  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }


  public int getOnSellStatus() {
    return onSellStatus;
  }

  public void setOnSellStatus(int onSellStatus) {
    this.onSellStatus = onSellStatus;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", bookName='" + bookName + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", stock=" + stock +
            ", press='" + press + '\'' +
            ", otherInfo='" + otherInfo + '\'' +
            ", onSellStatus=" + onSellStatus +
            '}';
  }
}
