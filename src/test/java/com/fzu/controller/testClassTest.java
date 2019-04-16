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

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//由于是Web项目，Junit需要模拟ServletContext
public class testClassTest {
    @Autowired
    private MockMvc mvc;
    @Test
    public void selectAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/selectAll"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void show() {
    }

    @Test
    public void addAccount() {
    }

    @Test
    public void login() {
    }
}