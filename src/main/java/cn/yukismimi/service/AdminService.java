package cn.yukismimi.service;

import cn.yukismimi.entity.Admin;

import java.util.List;

public interface AdminService {

    void addAdmin(Admin admin);

    void removeAdminById(int id);

    void modifyAdmin(Admin admin);

    Admin findById(int id);

    Admin findByName(String name);

    List<Admin> findAdminList();
}
