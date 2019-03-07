package cn.yukismimi.entity;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("favourite")
public class Favourite {

  private String favId;
  private int userId;
  private int BookId;
  private LocalDateTime addTime;

  public String getFavId() {
    return favId;
  }

  public void setFavId(String favId) {
    this.favId = favId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getBookId() {
    return BookId;
  }

  public void setBookId(int bookId) {
    BookId = bookId;
  }

  public LocalDateTime getAddTime() {
    return addTime;
  }

  public void setAddTime(LocalDateTime addTime) {
    this.addTime = addTime;
  }
}
