package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.UserSecurityQuestion;
import cn.yukismimi.mapper.UserSecurityQuestionMapper;
import cn.yukismimi.service.UserSecurityQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserSecurityQuestionService")
public class UserSecurityQuestionServiceImpl implements UserSecurityQuestionService {

    @Autowired
    UserSecurityQuestionMapper userSecurityQuestionMapper;

    @Override
    public int addUserSecurityQuestion(UserSecurityQuestion userSecurityQuestion) {
        return userSecurityQuestionMapper.addUserSecurityQuestion(userSecurityQuestion);
    }

    @Override
    public int modifyUserSecurityQuestion(int userId, int questionNo, String answer) {
        return userSecurityQuestionMapper.modifyUserSecurityQuestion(userId, questionNo, answer);
    }

    @Override
    public List<UserSecurityQuestion> findUserSecurityQuestionList(int userId) {
        return userSecurityQuestionMapper.findUserSecurityQuestionList(userId);
    }
}
