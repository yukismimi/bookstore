package cn.yukismimi.service;

import cn.yukismimi.entity.Transaction;

import java.util.List;

public interface TransactionService {

    void addTransaction(Transaction transaction);

    void removeTransactionById(int id);

    void modifyTransaction(Transaction transaction);

    Transaction findById(int id);

    Transaction findByName(String name);

    List<Transaction> findTransactionList();
}
