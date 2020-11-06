package com.example.demo;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void syncSend(){
        SendResult result = rocketMQTemplate.syncSend("test_topic_1:Tag1", "这是一条同步消息", 10000);
        System.out.println(result);
    }
}
