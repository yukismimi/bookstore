package cn.yukismimi.controller;

import cn.yukismimi.entity.Admin;
import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("admin")
    public ResponseData adminLogin(@RequestBody Admin admin){
        return adminService.adminLogin(admin);
    }
}
