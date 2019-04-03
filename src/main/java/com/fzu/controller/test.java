package com.fzu.controller;

import com.fzu.bean.account;
import com.fzu.bean.user;
import com.fzu.service.accountService;
import com.fzu.service.userService;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class test {
    @Resource
    private userService userServiceImpl;

    @RequestMapping("selectAll")
    public List<user> selectAll() {

        return userServiceImpl.selectAll();
    }

    @Resource
    private accountService accountServiceImpl;
    @RequestMapping("addAccount")
    public int addAccount(@RequestBody account account) {
        account.setUserId(2);
        System.out.println(account);
        int result = accountServiceImpl.addAccount(account);
        System.out.println(result);
        return result;
    }

    @RequestMapping("login")
    public int login(@RequestBody account account) {
        account record = null;
        record = accountServiceImpl.login(account);
        if (record == null) return 0;
        System.out.println(accountServiceImpl.login(account));
        return 1;
    }
}
