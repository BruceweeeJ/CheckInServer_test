package com.fzu.mapper;

import com.fzu.bean.account;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface accountMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(account record);


    int insertSelective(account record);


    account selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(account record);


    int updateByPrimaryKey(account record);

    account login(account record);

    int getCount();
}