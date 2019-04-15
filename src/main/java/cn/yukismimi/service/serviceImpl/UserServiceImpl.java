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

import static java.util.stream.Collectors.toList;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BalanceMapper balanceMapper;



    @Override
    public ResponseData registerUser(User user) {
        ResponseData res = new ResponseData();
        boolean isRegisted =  findUserList().stream()
                .filter(i -> i.getUserName().equals(user.getUserName()))
                .collect(toList())
                .size() > 0;


        if(!isRegisted){
            userMapper.registerUser(user);
            Balance balance = new Balance();
            balance.setId(user.getId());
            balance.setBalance(0d);
            balanceMapper.initBalance(balance);
            res.setCode(1);
            res.setResult("success");
            res.setData(user.getId());
        }

        return res;
    }


    @Override
    public ResponseData checkUser(User user){
        ResponseData res = new ResponseData();

        User userVerified = findUserList().stream()
                .filter(i -> i.getUserName().equals(user.getUserName()))
                .findFirst()
                .get();

        boolean flag = Optional.ofNullable(userVerified)
                        .map(User::getPassword)
                        .map(i -> i.equals(user.getPassword()))
                        .orElse(false);

        if(flag){
            res.setCode(1);
            res.setResult("success");
            res.setData(userVerified);
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
    public List<User> findUser(User user)
    {
        return userMapper.findUser(user);
    }

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public ResponseData changePassword(int id, String beforePassword, String afterPassword) {
        User user = findUserById(id);

        ResponseData res = new ResponseData();

        boolean flag =  Optional.ofNullable(user)
                .map(User::getPassword)
                .map(password -> password.equals(beforePassword))
                .orElse(false);


        if(flag){
            userMapper.setPassword(id,afterPassword);
            res.setCode(1);
            res.setResult("success");
        }

        return res;
    }
}
