package com.totoro.config;

import com.totoro.bean.Hello;
import com.totoro.bean.User;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
@ComponentScan(value = "com.totoro.bean",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Repository.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = User.class)
})
@Configuration
@Import({Hello.class})
public class WebConfig {

    @Conditional(MyCondition.class)
    @Bean
    public User user(){
//        System.out.println("往IOC容器中注册user bean");
        return new User("totoro",18);
    }
}
