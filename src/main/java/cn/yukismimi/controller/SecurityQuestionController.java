package cn.yukismimi.controller;

import cn.yukismimi.entity.SecurityQuestion;
import cn.yukismimi.service.SecurityQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 暂时不使用
 */
@RestController
public class SecurityQuestionController {

    @Autowired
    SecurityQuestionService securityQuestionService;

    @GetMapping("SecurityQuestionList")
    public List<SecurityQuestion> findSecurityQuestionList(){
        return securityQuestionService.findSecurityQuestionList();
    }

}