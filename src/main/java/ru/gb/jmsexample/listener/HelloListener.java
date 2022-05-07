//package ru.gb.jmsexample.listener;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.messaging.MessageHeaders;
//import org.springframework.messaging.handler.annotation.Headers;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.stereotype.Component;
//import ru.gb.jmsexample.config.JmsConfig;
//import ru.gb.jmsexample.model.HelloWorldMessage;
//
//@RequiredArgsConstructor
//@Component
//public class HelloListener {
//
//    private final JmsTemplate jmsTemplate;

//    @JmsListener(destination = JmsConfig.GB_QUEUE)
//    public void listen(@Payload HelloWorldMessage helloWorldMessage,
//                       @Headers MessageHeaders messageHeaders) {
//        System.out.println("--------------------");
//        System.out.println(helloWorldMessage.getMessage());
//        System.out.println("--------------------");
//        throw new RuntimeException("my exception");
//    }
//}
