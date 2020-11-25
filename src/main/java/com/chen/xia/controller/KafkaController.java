package com.chen.xia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/kafka")
@Controller
public class KafkaController {
//    @Autowired
//    private KafkaProducer kafkaProducer;
//
//    @GetMapping("/send")
//    @ResponseBody
//    @Transactional(rollbackFor = Exception.class)
//    public void sendMsg(){
//        kafkaProducer.send("this is a test kafka topic message!");
//    }
}
