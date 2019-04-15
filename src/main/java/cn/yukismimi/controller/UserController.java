package cn.yukismimi.controller;

import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.User;
import cn.yukismimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("user")
    public User findUserById(@RequestParam int id){
        return userService.findUserById(id);
    }

    @GetMapping("userList")
    public List<User> findUserList(){
        return userService.findUserList();
    }

    @PostMapping("login")
    public ResponseData login(@RequestBody User user){
        return userService.checkUser(user);
    }

    @PostMapping("userList")
    public List<User>  findUser(@RequestBody User User){
        return userService.findUser(User);
    }

    @PostMapping("register")
    public ResponseData registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PutMapping("user")
    public void modifyUser(@RequestBody User user){
        userService.modifyUser(user);
    }

    @PutMapping("password")
    public ResponseData changePassword(@RequestParam int id,
                               @RequestParam String beforePassword,
                               @RequestParam String afterPassword){
        return userService.changePassword(id, beforePassword, afterPassword);
    }

}
