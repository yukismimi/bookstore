package cn.yukismimi.entity;


public class UserSecurityQuestion {

  private String id;
  private long questionNo;
  private String answer;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
