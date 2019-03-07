package cn.yukismimi.controller;

import cn.yukismimi.entity.RechargeRecord;
import cn.yukismimi.service.RechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RechargeRecordController {

    @Autowired
    RechargeRecordService rechargeRecordService;

    @GetMapping("rechargeRecord")
    public List<RechargeRecord> findRechargeRecordList(@RequestParam int userId){
        return rechargeRecordService.findRechargeRecordList(userId);
    }
}
