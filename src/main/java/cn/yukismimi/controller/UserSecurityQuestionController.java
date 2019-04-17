package cn.yukismimi.controller;

import cn.yukismimi.entity.UserSecurityQuestion;
import cn.yukismimi.service.UserSecurityQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 暂时不使用
 */
@RestController
public class UserSecurityQuestionController {

    @Autowired
    UserSecurityQuestionService userSecurityQuestionService;

    @GetMapping("userSecurityQuestionList")
    public List<UserSecurityQuestion> findUserSecurityQuestionList(@RequestParam int userId){
        return userSecurityQuestionService.findUserSecurityQuestionList(userId);
    }

    @PostMapping("userSecurityQuestion")
    public int addUserSecurityQuestion(@RequestBody UserSecurityQuestion userSecurityQuestion){
        return userSecurityQuestionService.addUserSecurityQuestion(userSecurityQuestion);
    }

    @PutMapping("userSecurityQuestion")
    public int modifyUserSecurityQuestion(@RequestParam int userId,
                                          @RequestParam int questionNo,
                                          @RequestParam String answer){

        return userSecurityQuestionService.modifyUserSecurityQuestion(userId, questionNo, answer);
    }

}
