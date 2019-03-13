package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("userSecurityQuestion")
public class UserSecurityQuestion {

  private int userId;
  private int questionNo;
  private String answer;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getQuestionNo() {
    return questionNo;
  }

  public void setQuestionNo(int questionNo) {
    this.questionNo = questionNo;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
