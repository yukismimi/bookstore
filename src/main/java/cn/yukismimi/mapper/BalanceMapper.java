package cn.yukismimi.mapper;

import cn.yukismimi.entity.Balance;

public interface BalanceMapper {

    int initBalance(Balance balance);

    int modifyBalance(Balance balance);

    Balance queryBalance(int id);
}
