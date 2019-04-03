package com.fzu.mapper;

import com.fzu.bean.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {

    List<user> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}