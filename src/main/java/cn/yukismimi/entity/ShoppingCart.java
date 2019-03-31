package cn.yukismimi.entity;


import org.apache.ibatis.type.Alias;

@Alias("shoppingCart")
public class ShoppingCart {

  private int bookId;
  private int userId;
  private long amount;
  private Book bookInfo;

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


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  public Book getBookInfo() {
    return bookInfo;
  }

  public void setBookInfo(Book bookInfo) {
    this.bookInfo = bookInfo;
  }

}
