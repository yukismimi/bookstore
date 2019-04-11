package cn.yukismimi.service;

import cn.yukismimi.entity.Admin;
import cn.yukismimi.entity.ResponseData;

public interface AdminService {

    ResponseData adminLogin(Admin admin);

}
