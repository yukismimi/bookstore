package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Balance;
import cn.yukismimi.entity.RechargeRecord;
import cn.yukismimi.mapper.BalanceMapper;
import cn.yukismimi.mapper.RechargeRecordMapper;
import cn.yukismimi.service.RechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("RechargeRecordService")
public class RechargeRecordServiceImpl implements RechargeRecordService {

    @Autowired
    RechargeRecordMapper rechargeRecordMapper;

    @Autowired
    BalanceMapper balanceMapper;

    @Override
    public int addRechargeRecord(int userId, double rechargeAmount) {
        RechargeRecord rechargeRecord = new RechargeRecord();

        rechargeRecord.setUserId(userId);
        rechargeRecord.setRechargeAmount(rechargeAmount);
        rechargeRecord.setRechargeNo(UUID.randomUUID().toString());
        rechargeRecord.setRechargeTime(LocalDateTime.now());
        rechargeRecord.setRechargeStatus(1);
        rechargeRecord.setDeleteFlag(0);

        return rechargeRecordMapper.addRechargeRecord(rechargeRecord);

    }

    @Override
    public List<RechargeRecord> findRechargeRecordList(int userId) {
        return rechargeRecordMapper.findRechargeRecordList(userId);
    }
}
