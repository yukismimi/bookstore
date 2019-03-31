package cn.yukismimi.service;

import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.User;

import java.util.List;

public interface UserService {

    void registerUser(User user);

    ResponseData checkUser(User user);

    void modifyUser(User user);

    User findUserById(int id);

    User findUser(User user);

    List<User> findUserList();

    void changePassword(int id, String beforePassword, String afterPassword);
}
