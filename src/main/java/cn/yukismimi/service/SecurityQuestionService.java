package cn.yukismimi.service;

import cn.yukismimi.entity.SecurityQuestion;

import java.util.List;

public interface SecurityQuestionService {

    void addSecurityQuestion(SecurityQuestion securityQuestion);

    void removeSecurityQuestionById(int id);

    void modifySecurityQuestion(SecurityQuestion securityQuestion);

    SecurityQuestion findById(int id);

    SecurityQuestion findByName(String name);

    List<SecurityQuestion> findSecurityQuestionList();
}
