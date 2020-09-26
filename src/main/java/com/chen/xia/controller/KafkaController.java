package com.chen.xia.controller;

import com.chen.xia.conf.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/kafka")
@Controller
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/send")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public void sendMsg(){
        kafkaProducer.send("this is a test kafka topic message!");
    }
}
