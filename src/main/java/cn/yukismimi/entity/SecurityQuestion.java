package cn.yukismimi.entity;

import org.apache.ibatis.type.Alias;

@Alias("securityQuestion")
public class SecurityQuestion {

  private int questionNo;
  private String questionContent;


  public int getQuestionNo() {
    return questionNo;
  }

  public void setQuestionNo(int questionNo) {
    this.questionNo = questionNo;
  }


  public String getQuestionContent() {
    return questionContent;
  }

  public void setQuestionContent(String questionContent) {
    this.questionContent = questionContent;
  }

}
