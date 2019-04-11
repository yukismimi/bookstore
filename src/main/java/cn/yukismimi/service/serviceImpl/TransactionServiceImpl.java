package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.*;
import cn.yukismimi.mapper.BalanceMapper;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.mapper.ShoppingCartMapper;
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

    @Autowired
    ShoppingCartMapper shoppingCartMapper;


    @Override
    public ResponseData createTransaction(List<Transaction> transactionList) {

        ResponseData res = new ResponseData();
        List<ShoppingCart> shoppingCartList = new ArrayList<>();
        double sum = 0d;

        int uid = Optional.ofNullable(transactionList)
                .map(list -> list.get(0).getUserId())
                .orElse(-1);

        for(Transaction transaction : transactionList) {

            transaction.setOrderNo(UUID.randomUUID().toString());
            transaction.setOrderTime(LocalDateTime.now());
            transaction.setOrderStatus(1);
            transaction.setTotalPrice(transaction.getUnitPrice() * transaction.getAmount());

            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.setUserId(transaction.getUserId());
            shoppingCart.setBookId(transaction.getBookId());
            shoppingCartList.add(shoppingCart);

            sum += transaction.getTotalPrice();
        }

        if(uid != -1) {
            double balance = balanceMapper.queryBalance(uid).getBalance();
            if(balance > sum){
                Balance bls = new Balance();
                bls.setBalance(balance-sum);
                bls.setId(uid);
                balanceMapper.modifyBalance(bls);
                transactionMapper.createTransaction(transactionList);
                shoppingCartList.forEach(shoppingCartMapper::removeItemFromShoppingCart);

                res.setCode(1);
                res.setResult("success");
            }
        }

        return res;
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

    @Override
    public List<Transaction> findTransaction() {
        return transactionMapper.findTransaction();
    }
}
