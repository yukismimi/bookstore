package cn.yukismimi.mapper;

import cn.yukismimi.entity.User;

import java.util.List;

public interface UserMapper {

    void addUser(User user);

    void removeUserById(int id);

    void modifyUser(User user);

    User findById(int id);

    User findByName(String name);

    List<User> findUserList();
}
