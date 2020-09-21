package com.chen.xia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session){
        String result = "";

        if(!StringUtils.isEmpty(username)&&password.equals("123456")){

            String token = UUID.randomUUID().toString().replace("-","");
            session.setAttribute("token",token);
            result = "{\"msg\": \"sucess\", \"code\": 200,\"session\":\""+token+"\"}";

        }else {
            result = "{\"msg\": \"account or password is error\", \"code\": 202,\"session\":\"\"}";
        }

        System.out.println("token=="+session.getAttribute("token"));
        return result;
    }
}
