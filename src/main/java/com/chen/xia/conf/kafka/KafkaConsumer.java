package com.chen.xia.conf.kafka;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = KafkaProducer.TOPIC_TEST,groupId = KafkaProducer.TOPIC_GROUP1)
    public void topic_test(ConsumerRecord<?,?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
        Optional message =  Optional.ofNullable(record.value());
        if(message.isPresent()){
            Object msg = message.get();
            System.out.println("topic_test 消费了：Topic:"+topic+",Message:"+msg);
            ack.acknowledge();
        }
    }

    @KafkaListener(topics = KafkaProducer.TOPIC_TEST ,groupId = KafkaProducer.TOPIC_GROUP2)
    public void topic_test1(ConsumerRecord<?,?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
        Optional message = Optional.ofNullable(record.value());
        if(message.isPresent()){
            Object msg = message.get();
            System.out.println("topic_test1 消费了：Topic:"+topic+",Message:"+msg);
            ack.acknowledge();
        }
    }
}
