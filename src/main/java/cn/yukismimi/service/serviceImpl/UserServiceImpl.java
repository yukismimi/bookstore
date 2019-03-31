package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Balance;
import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.User;
import cn.yukismimi.mapper.BalanceMapper;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.mapper.UserMapper;
import cn.yukismimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BalanceMapper balanceMapper;
    @Override
    public void registerUser(User user) {
        userMapper.registerUser(user);
        Balance balance = new Balance();
        balance.setId(user.getId());
        balance.setBalance(0d);
        balanceMapper.initBalance(balance);
    }


    @Override
    public ResponseData checkUser(User user){

        ResponseData res = new ResponseData();

        User userInfo = Optional.ofNullable(user)
                .map(userMapper::findUser)
                .orElse(null);

        Boolean flag = Optional.ofNullable(userInfo)
                .map(User::getPassword)
                .map(p -> p.equals(user.getPassword()))
                .orElse(false);

        if(flag){
            res.setCode(1);
            res.setResult("success");
            res.setData(userInfo);
        }

        return res;
    }

    @Override
    public void modifyUser(User user) {
        userMapper.modifyUser(user);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public void changePassword(int id, String beforePassword, String afterPassword) {
        User user = findUserById(id);
        Optional.ofNullable(user).ifPresent(u -> {
            System.out.println(u.getPassword().equals(beforePassword));
            if(u.getPassword().equals(beforePassword)){
                userMapper.setPassword(id, afterPassword);
            }
        });
    }
}
