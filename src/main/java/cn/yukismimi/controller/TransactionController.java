package cn.yukismimi.controller;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.Transaction;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("TransactionList")
    public List<Transaction> findTransactionList(@RequestParam int userId){
       return transactionService.findTransactionList(userId);
    }

    @PostMapping("findTransactionByOption")
    public List<Transaction> findTransactionByOption(@RequestBody Transaction transaction){
        return transactionService.findTransactionByOption(transaction);
    }

    @DeleteMapping("Transaction")
    public int removeTransactionByOrderNo(@RequestParam String orderNo){
        return transactionService.removeTransactionByOrderNo(orderNo);
    }


    @PostMapping("Transaction")
    public ResponseData createTransaction(@RequestBody List<Transaction> transactionList){
        return transactionService.createTransaction(transactionList);
    }

    @PutMapping("Transaction")
    public int modifyTransaction(@RequestParam String orderNo,
                                 @RequestParam int orderStatus){
        return transactionService.modifyTransaction(orderNo, orderStatus);
    }

}
