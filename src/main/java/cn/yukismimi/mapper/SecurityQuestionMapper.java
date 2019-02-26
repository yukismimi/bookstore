package cn.yukismimi.mapper;

import cn.yukismimi.entity.SecurityQuestion;

import java.util.List;

public interface SecurityQuestionMapper {

    void addSecurityQuestion(SecurityQuestion securityQuestion);

    void removeSecurityQuestionById(int id);

    void modifySecurityQuestion(SecurityQuestion securityQuestion);

    SecurityQuestion findById(int id);

    SecurityQuestion findByName(String name);

    List<SecurityQuestion> findSecurityQuestionList();
}
