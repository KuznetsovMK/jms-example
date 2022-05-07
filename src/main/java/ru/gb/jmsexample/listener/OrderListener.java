package ru.gb.jmsexample.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.gb.api.events.OrderEvent;
import ru.gb.jmsexample.config.JmsConfig;

@RequiredArgsConstructor
@Component
public class OrderListener {

    @JmsListener(destination = JmsConfig.ORDER_CHANGED)
    public void listen(@Payload OrderEvent orderEvent) {
        System.out.println(orderEvent);
    }
}
