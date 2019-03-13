package cn.yukismimi.service;

import cn.yukismimi.entity.UserSecurityQuestion;

import java.util.List;

public interface UserSecurityQuestionService {

    int addUserSecurityQuestion(UserSecurityQuestion userSecurityQuestion);

    int modifyUserSecurityQuestion(int userId, int questionNo, String answer);

    List<UserSecurityQuestion> findUserSecurityQuestionList(int userId);
}
