package com.chen.xia.conf.kafka;



import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

//    @KafkaListener(topics = KafkaProducer.TOPIC_TEST,groupId = KafkaProducer.TOPIC_GROUP1)
//    public void topic_test(ConsumerRecord<?,?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
//        Optional message =  Optional.ofNullable(record.value());
//        if(message.isPresent()){
//            Object msg = message.get();
//            System.out.println("topic_test 消费了：Topic:"+topic+",Message:"+msg);
//            ack.acknowledge();
//        }
//    }
//s
//    @KafkaListener(topics = KafkaProducer.TOPIC_TEST ,groupId = KafkaProducer.TOPIC_GROUP2)
//    public void topic_test1(ConsumerRecord<?,?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
//        Optional message = Optional.ofNullable(record.value());
//        if(message.isPresent()){
//            Object msg = message.get();
//            System.out.println("topic_test1 消费了：Topic:"+topic+",Message:"+msg);
//            ack.acknowledge();
//        }
//    }
}
