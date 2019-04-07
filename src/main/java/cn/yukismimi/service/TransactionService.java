package cn.yukismimi.service;

import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.Transaction;

import java.util.List;

public interface TransactionService {

    ResponseData createTransaction(List<Transaction> transactionList);

    int removeTransactionByOrderNo(String orderNo);

    int modifyTransaction(String orderNo, int orderStatus);

    List<Transaction> findTransactionByOption(Transaction transaction);

    List<Transaction> findTransactionList(int userId);
}
