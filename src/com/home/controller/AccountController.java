package com.home.controller;

import com.home.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public String saveAccount(Account account) {
        System.out.println("保存了账户");
        return "success";
    }

    @RequestMapping(value = "/removeAccount",params = {"accountName","money>100"})
    public String removeAccount(String accountName,Float money) {
        System.out.println("删除了账户");
        return "success";
    }

    @RequestMapping("/findAccount")
    public String findAccount(Integer accountId,String accountName) {
        System.out.println("查询了账户："+accountId);
        return "success";
    }

    @RequestMapping("/deleteAccount")
    public String deleteAccount(String date) {
        System.out.println("删除了账户"+date);
        return "success";
    }
}
