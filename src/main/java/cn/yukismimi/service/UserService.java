package cn.yukismimi.service;

import cn.yukismimi.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUserById(int id);

    void modifyUser(User user);

    User findById(int id);

    User findByName(String name);

    List<User> findUserList();
}
