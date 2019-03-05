package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Balance;
import cn.yukismimi.mapper.BalanceMapper;
import cn.yukismimi.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("balanceService")
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    BalanceMapper balanceMapper;

    @Override
    public int rechargeBalance(int id, double rechargeAmount) {
        double nowBalance = queryBalance(id).getBalance();
        Balance balance = new Balance();
        balance.setId(id);
        balance.setBalance(nowBalance+rechargeAmount);
        return balanceMapper.rechargeBalance(balance);
    }

    @Override
    public Balance queryBalance(int id) {
        return balanceMapper.queryBalance(id);
    }
}
