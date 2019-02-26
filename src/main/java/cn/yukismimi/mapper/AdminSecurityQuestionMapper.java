package cn.yukismimi.mapper;

import cn.yukismimi.entity.AdminSecurityQuestion;

import java.util.List;

public interface AdminSecurityQuestionMapper {

    void addAdminSecurityQuestion(AdminSecurityQuestion adminSecurityQuestion);

    void removeAdminSecurityQuestionById(int id);

    void modifyAdminSecurityQuestion(AdminSecurityQuestion adminSecurityQuestion);

    AdminSecurityQuestion findById(int id);

    AdminSecurityQuestion findByName(String name);

    List<AdminSecurityQuestion> findAdminSecurityQuestionList();
}
