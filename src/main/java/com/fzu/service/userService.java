package com.fzu.service;

import com.fzu.bean.account;
import com.fzu.bean.user;

import java.util.List;

public interface userService {
    List<user> selectAll();
}
