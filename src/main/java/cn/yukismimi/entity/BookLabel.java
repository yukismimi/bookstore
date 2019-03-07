package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("bookLabel")
public class BookLabel {

  private int bookId;
  private String label;

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
