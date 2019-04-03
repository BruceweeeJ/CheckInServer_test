package com.fzu.service.impl;

import com.fzu.bean.account;
import com.fzu.mapper.accountMapper;
import com.fzu.service.accountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class accountServiceImpl implements accountService {
    @Resource
    private accountMapper accountMapper;
    @Override
    public int addAccount(account account) {
        return accountMapper.insert(account);
    }

    @Override
    public account login(account account) {
        return accountMapper.login(account);
    }
}
