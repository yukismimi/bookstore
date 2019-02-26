package cn.yukismimi.entity;


public class AdminSecurityQuestion {

  private String adminId;
  private long questionNo;
  private String answer;


  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
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
