package cn.yukismimi.mapper;

import cn.yukismimi.entity.UserSecurityQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserSecurityQuestionMapper {

    int addUserSecurityQuestion(UserSecurityQuestion userSecurityQuestion);

    int modifyUserSecurityQuestion(@Param("userId") int userId, @Param("questionNo") int questionNo, @Param("answer") String answer);

    List<UserSecurityQuestion> findUserSecurityQuestionList(int userId);
}
