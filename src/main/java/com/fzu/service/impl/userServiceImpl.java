package com.fzu.service.impl;

import com.fzu.bean.account;
import com.fzu.bean.user;
import com.fzu.mapper.accountMapper;
import com.fzu.mapper.userMapper;
import com.fzu.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Resource
    private userMapper userMapper;
    @Override
    public List<user> selectAll() {
        return userMapper.selectAll();
    }

}
