package com.totoro;

import com.totoro.listener.MyEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringListenerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringListenerApplication.class, args);
        MyEventPublisher publisher = run.getBean(MyEventPublisher.class);
        publisher.publishEvent();

    }

}
