package cn.yukismimi.service;

import cn.yukismimi.entity.UserSecurityQuestion;

import java.util.List;

public interface UserSecurityQuestionService {

    void addUserSecurityQuestion(UserSecurityQuestion userSecurityQuestion);

    void removeUserSecurityQuestionById(int id);

    void modifyUserSecurityQuestion(UserSecurityQuestion userSecurityQuestion);

    UserSecurityQuestion findById(int id);

    UserSecurityQuestion findByName(String name);

    List<UserSecurityQuestion> findUserSecurityQuestionList();
}
