package cn.yukismimi.mapper;

import cn.yukismimi.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    void addAdmin(Admin admin);

    void removeremoveAdminById(int id);

    void modifyAdmin(Admin admin);

    Admin findById(int id);

    Admin findByName(String name);

    List<Admin> findAdminList();
}
