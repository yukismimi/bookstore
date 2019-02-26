package cn.yukismimi.mapper;

import cn.yukismimi.entity.RechargeRecord;

import java.util.List;

public interface RechargeRecordMapper {

    void addRechargeRecord(RechargeRecord rechargeRecord);

    void removeRechargeRecordById(int id);

    void modifyRechargeRecord(RechargeRecord rechargeRecord);

    RechargeRecord findById(int id);

    RechargeRecord findByName(String name);

    List<RechargeRecord> findRechargeRecordList();
}
