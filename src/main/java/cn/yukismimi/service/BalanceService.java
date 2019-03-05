package cn.yukismimi.service;

import cn.yukismimi.entity.Balance;

public interface BalanceService {

    int rechargeBalance(int id, double rechargeAmount);

    Balance queryBalance(int id);

}
