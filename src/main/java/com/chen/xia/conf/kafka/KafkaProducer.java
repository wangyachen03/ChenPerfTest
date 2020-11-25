package com.chen.xia.conf.kafka;


import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//    public static final String TOPIC_TEST = "topic.test";
//
//    public static final String TOPIC_GROUP1 = "topic.group1";
//
//    public static final String TOPIC_GROUP2 = "topic.group2";
//
//    public void send(Object obj){
//        String obj2String = JSONObject.toJSONString(obj);
//        System.out.println("准备发送消息：{}"+obj2String);
//
//        ListenableFuture<SendResult<String,Object>> fature = kafkaTemplate.send(TOPIC_TEST,obj);
//
//        fature.addCallback(new ListenableFutureCallback<SendResult<String, Object>>(){
//
//            @Override
//            public void onSuccess(SendResult<String, Object> result) {
//                //发送成功的处理
//                System.out.println(TOPIC_TEST+" - 生产着发送消息失败："+result.toString());
//            }
//
//            @Override
//            public void onFailure(Throwable ex) {
//                //发送失败的处理
//                System.out.println(TOPIC_TEST+" - 生产着发送消息失败："+ex.getMessage());
//            }
//        });
//    }
}
