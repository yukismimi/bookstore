package cn.yukismimi.mapper;

import cn.yukismimi.entity.Transaction;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface TransactionMapper {

    int createTransaction(List<Transaction> transactionList);

    int removeTransactionByOrderNo(String orderNo);

    int modifyTransaction(@Param("orderNo") String orderNo, @Param("orderStatus") int orderStatus);

    List<Transaction> findTransactionByOption(Transaction transaction);

    List<Transaction> findTransactionList(int userId);
}
