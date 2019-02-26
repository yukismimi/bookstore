package cn.yukismimi.service;

import cn.yukismimi.entity.RechargeRecord;

import java.util.List;

public interface RechargeRecordService {

    void addRechargeRecord(RechargeRecord rechargeRecord);

    void removeRechargeRecordById(int id);

    void modifyRechargeRecord(RechargeRecord rechargeRecord);

    RechargeRecord findById(int id);

    RechargeRecord findByName(String name);

    List<RechargeRecord> findRechargeRecordList();
}
