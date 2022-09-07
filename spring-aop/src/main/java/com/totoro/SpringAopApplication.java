package com.totoro;

import com.totoro.aop.TargetClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);

        TargetClass targetClass = context.getBean(TargetClass.class);
        targetClass.test("aop");
    }

}
