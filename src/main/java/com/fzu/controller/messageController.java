package com.fzu.controller;

import net.minidev.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.charset.Charset;


@RestController
@CrossOrigin
public class messageController {
    @RequestMapping("getCode")
    public int getCode(@RequestBody JSONObject jsonObj) {
        HttpPost post = new HttpPost("https://open.ucpaas.com/ol/sms/sendsms");
        HttpClient httpClient  = HttpClientBuilder.create().build();
        HttpResponse response = null;
        System.out.println(jsonObj);
        // 构建消息实体
        StringEntity entity = new StringEntity(jsonObj.toString(), Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");
        // 发送Json格式的数据请求
        entity.setContentType("application/json");
        post.setEntity(entity);
        try {
            response = httpClient.execute(post);
        } catch (IOException e) {
            System.out.println(response);
            return 0;
        }
        System.out.println(response);
        System.out.println("hello world");
        return 1;
    }

    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
}
