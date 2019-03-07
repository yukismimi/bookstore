package cn.yukismimi.service;

import cn.yukismimi.entity.RechargeRecord;

import java.util.List;

public interface RechargeRecordService {

    int addRechargeRecord(int userId, double rechargeAmount);

    List<RechargeRecord> findRechargeRecordList(int userId);
}
