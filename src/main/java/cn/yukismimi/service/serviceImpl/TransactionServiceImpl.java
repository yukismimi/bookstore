package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Adress;
import cn.yukismimi.entity.Balance;
import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.Transaction;
import cn.yukismimi.mapper.BalanceMapper;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.mapper.TransactionMapper;
import cn.yukismimi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionMapper transactionMapper;

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BalanceMapper balanceMapper;

    @Override
    public int createTransaction(Transaction transaction) {
       return  Optional.ofNullable(transaction.getBookId())
                .map(bookMapper::findBookById)
                .map(i -> {
                    transaction.setOrderTime(LocalDateTime.now());
                    transaction.setOrderNo(UUID.randomUUID().toString());
                    transaction.setOrderStatus(1);
                    transaction.setBookName(i.getBookName());
                    transaction.setUnitPrice(i.getPrice());
                    transaction.setTotalPrice(i.getPrice() * transaction.getAmount());
                    /*
                        address相关
                    */
                    return transaction;
                })
                .map(i -> {
                    transactionMapper.createTransaction(i);
                    Balance balance = balanceMapper.queryBalance(i.getUserId());
                    balance.setBalance(balance.getBalance()-i.getTotalPrice());
                    return balanceMapper.modifyBalance(balance);
                })
               .get();
    }

    @Override
    public int removeTransactionByOrderNo(String orderNo) {
        return transactionMapper.removeTransactionByOrderNo(orderNo);
    }

    @Override
    public int modifyTransaction(String orderNo, int orderStatus) {
        return transactionMapper.modifyTransaction(orderNo, orderStatus);
    }

    @Override
    public List<Transaction> findTransactionByOption(Transaction transaction) {
        return transactionMapper.findTransactionByOption(transaction);
    }

    @Override
    public List<Transaction> findTransactionList(int userId) {
        return transactionMapper.findTransactionList(userId);
    }
}
