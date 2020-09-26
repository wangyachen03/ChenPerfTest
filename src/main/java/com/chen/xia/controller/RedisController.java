package com.chen.xia.controller;

import com.chen.xia.entity.User;
import com.chen.xia.util.RedisUtil;
import javafx.beans.binding.ObjectBinding;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/redis")
@Controller
public class RedisController {
    private static int EXPIRETIME = 120;  //redis中存储时间120s

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("set")
    @ResponseBody
    public boolean redisSet(String key){
        User user = new User(22,"fengxia","qwer1234","女",3);

        return redisUtil.set(key,user,EXPIRETIME);
    }

    @GetMapping("get")
    @ResponseBody
    public Object redisGet(@RequestParam  String key){
        return redisUtil.get(key);
    }

    @GetMapping("expire")
    @ResponseBody
    public boolean expire(@RequestParam String key,@RequestParam long expireTime){
        return redisUtil.expire(key,expireTime);
    }
}
