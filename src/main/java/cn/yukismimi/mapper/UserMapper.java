package cn.yukismimi.mapper;

import cn.yukismimi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int registerUser(User user);

    void modifyUser(User user);

    User findUserById(int id);

    List<User> findUserList();

    User findUser(User user);

    void setPassword(@Param("id") int id, @Param("afterPassword")String afterPassword);
}
