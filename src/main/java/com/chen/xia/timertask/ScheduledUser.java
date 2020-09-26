package com.chen.xia.timertask;

import com.chen.xia.entity.User;
import com.chen.xia.util.RedisUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Scheduled 定时任务
 */
@Component
public class ScheduledUser {

    @Resource
    private RedisUtil redisUtil;

    /**
     * 定时任务
     * @Scheduled:  设置定时任务
     * cron属性: cron表达式，定时任务触发时间
     */
    @Scheduled(cron = "0/2 * * * * *")
    public void addUser(){
        User user = (User) redisUtil.get("chen");
        if (user!=null){
            System.out.println("调用定时任务..."+new Date()+user.toString());
        }else {
            System.out.println("调用定时任务..."+new Date());
        }
    }
}
