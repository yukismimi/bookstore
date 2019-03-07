package cn.yukismimi.mapper;

import cn.yukismimi.entity.RechargeRecord;

import java.util.List;

public interface RechargeRecordMapper {

    int addRechargeRecord(RechargeRecord rechargeRecord);

    List<RechargeRecord> findRechargeRecordList(int userId);
}
