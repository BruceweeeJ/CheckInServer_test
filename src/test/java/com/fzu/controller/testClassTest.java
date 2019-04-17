package com.fzu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.rmi.server.ExportException;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//由于是Web项目，Junit需要模拟ServletContext
public class testClassTest {
    @Autowired
    private MockMvc mvc;
    @Test
    public void selectAll() throws Exception {
        String response  =  mvc.perform(MockMvcRequestBuilders.get("/selectAll"))
                .andExpect(MockMvcResultMatchers.status().isOk())//返回的状态是200
        .andDo(print())//打印出请求和相应的内容
        .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串 ;
        System.out.println(response);

    }

    @Test
    public void show() throws Exception{
        String response  =  mvc.perform(MockMvcRequestBuilders.get("/show"))
                .andExpect(MockMvcResultMatchers.status().isOk())//返回的状态是200
                .andDo(print())//打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串 ;
        System.out.println(response);
    }

    @Test
    public void addAccount() {
    }

    @Test
    public void login() {
    }

    @Test
    public void getCount() throws Exception{
        String response  =  mvc.perform(MockMvcRequestBuilders.get("/getCount"))
                .andExpect(MockMvcResultMatchers.status().isOk())//返回的状态是200
                .andDo(print())//打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串 ;
        System.out.println(response);
    }
}