package cn.yukismimi.controller;

import cn.yukismimi.entity.Balance;
import cn.yukismimi.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("balance")
    public Balance queryBalance(@RequestParam int id){
        return balanceService.queryBalance(id);
    }

    @PutMapping("balance")
    public int rechargeBalance(@RequestParam int id,
                               @RequestParam double rechargeAmount){
        return balanceService.rechargeBalance(id, rechargeAmount);
    }
}
