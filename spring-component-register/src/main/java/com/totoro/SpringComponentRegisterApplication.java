package com.totoro;

import com.totoro.config.WebConfig;
import com.totoro.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class SpringComponentRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringComponentRegisterApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);


//        User user = context.getBean(User.class);
//        System.out.println(user);
//
//        String[] beanNames = context.getBeanNamesForType(User.class);
//        Arrays.stream(beanNames).forEach(System.out::println);
//
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
//
//        //@Scope
//        System.out.println("@Scope");
//        Object user1 = context.getBean("user");
//        Object user2 = context.getBean("user");
//        System.out.println(user1 == user2);

        //@Lazy
//        System.out.println("@Lazy");
//        System.out.println("容器创建完成");
//        Object user = context.getBean("user");


        //@Conditional
//        Environment environment = context.getEnvironment();
//        System.out.println(environment);


    }

}
