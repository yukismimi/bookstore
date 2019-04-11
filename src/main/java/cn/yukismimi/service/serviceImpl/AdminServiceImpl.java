package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Admin;
import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.mapper.AdminMapper;
import cn.yukismimi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public ResponseData adminLogin(Admin admin) {

        ResponseData res = new ResponseData();

        Admin ad = Optional.ofNullable(admin)
                .map(Admin::getAdminName)
                .map(adminMapper::queryAdmin)
                .orElse(null);

        boolean flag = Optional.ofNullable(ad)
                    .map(Admin::getPassword)
                    .map(i -> admin.getPassword().equals(i))
                    .orElse(false);

        if(flag){
            res.setCode(1);
            res.setResult("success");
            res.setData(ad);
        }

        return res;
    }

}
