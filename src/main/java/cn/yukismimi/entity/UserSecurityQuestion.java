package cn.yukismimi.entity;


public class UserSecurityQuestion {

  private String userId;
  private long questionNo;
  private String answer;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getQuestionNo() {
    return questionNo;
  }

  public void setQuestionNo(long questionNo) {
    this.questionNo = questionNo;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

}
