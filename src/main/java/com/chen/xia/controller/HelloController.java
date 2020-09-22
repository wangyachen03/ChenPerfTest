package com.chen.xia.controller;

import com.chen.xia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "docker-start-spring...";
    }

    @GetMapping("/login/hello")
    @ResponseBody
    public String login_hello(HttpServletRequest request){
        System.out.println("login/hello--token=="+request.getSession().getAttribute("token"));

        Enumeration<String> names = request.getSession().getAttributeNames();

        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }

        return "login_hello--docker-start-spring...";
    }

//    @GetMapping("/getUser")
//    @ResponseBody
//    public String getUserInfoById(){
//
//        System.out.println("....");
//        User user = userService.getUserInfoById(3);
//        System.out.println(user.toString());
//
//        return user.toString();
//    }
}