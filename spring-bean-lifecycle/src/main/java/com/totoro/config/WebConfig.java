package com.totoro.config;

import com.totoro.bean.Bird;
import com.totoro.bean.Fish;
import com.totoro.bean.MyBeanPostProcessor;
import com.totoro.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
@Configuration
public class WebConfig {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean
    public Fish fish(){
        return new Fish();
    }

    @Bean
    public Bird bird(){
        return new Bird();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public User user(){
        return new User();
    }
}
