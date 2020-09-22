package com.chen.xia.controller.user;

import com.chen.xia.entity.User;
import com.chen.xia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfoById")
    @ResponseBody
    public String getUserInfoById(@RequestParam int id){

        User user = userService.getUserInfoById(id);
        System.out.println(user.toString());

        return user.toString();
    }

    @GetMapping("/getUserInfoByLoginName")
    @ResponseBody
    public String getUserInfoByLoginName(@RequestParam String loginname){

        User user = userService.getUserInfoByLoginName(loginname);
        return user.toString();
    }

    @GetMapping("addUser")
    @ResponseBody
    public String addUser(@RequestParam String  loginname,
                          @RequestParam String passwd,
                          @RequestParam String sex,
                          @RequestParam int age){

        int uid = userService.insertUser(new User(loginname,passwd,sex,age));

        return "{\"msg\": \"adduser sucess ...\", \"code\": 200,\"id\":\""+uid+"\"}";
    }
}