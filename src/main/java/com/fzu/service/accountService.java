package com.fzu.service;

import com.fzu.bean.account;

public interface accountService {
    int addAccount(account account);
    account login(account account);
}
