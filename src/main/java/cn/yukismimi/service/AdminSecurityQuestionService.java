package cn.yukismimi.service;

import cn.yukismimi.entity.AdminSecurityQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminSecurityQuestionService {

    void addAdminSecurityQuestion(AdminSecurityQuestion adminSecurityQuestion);

    void removeAdminSecurityQuestionById(int id);

    void modifyAdminSecurityQuestion(AdminSecurityQuestion adminSecurityQuestion);

    AdminSecurityQuestion findById(int id);

    AdminSecurityQuestion findByName(String name);

    List<AdminSecurityQuestion> findAdminSecurityQuestionList();
}
