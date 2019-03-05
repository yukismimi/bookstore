package cn.yukismimi.controller;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.User;
import cn.yukismimi.other.Response;
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
    public List<User> findBookList(){
        return userService.findUserList();
    }

    @PostMapping("userList")
    public List<User> findBook(@RequestBody User User){
        return userService.findUser(User);
    }

    @PostMapping("user")
    public void registerUser(@RequestBody User user){
        userService.registerUser(user);
    }

    @PutMapping("user")
    public void modifyUser(@RequestBody User user){
        userService.modifyUser(user);
    }

    @PutMapping("password")
    public void changePassword(@RequestParam int id,
                               @RequestParam String beforePassword,
                               @RequestParam String afterPassword){
        userService.changePassword(id, beforePassword, afterPassword);
    }

    @PutMapping("test")
    public Response<List<User>> test(){
        Response<List<User>> response = new Response<>();
        response.setData(findBookList());
        return response;
    }

}
