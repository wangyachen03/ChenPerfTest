package com.chen.xia.controller;

import com.chen.xia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public String login( HttpServletRequest request){

        String token = UUID.randomUUID().toString().replace("-","");

        request.getSession().setAttribute("token",UUID.randomUUID().toString().replace("-",""));

        System.out.println("token :: "+token);

        return "{\"msg\": \"sucess\", \"code\": 200,\"session\":\""+token+"\"}";
    }


    @GetMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session){
        session.removeAttribute("token");
        return   "{\"msg\": \"退出登陆...\", \"code\": 200,\"session\":+\"\"}";
    }
}