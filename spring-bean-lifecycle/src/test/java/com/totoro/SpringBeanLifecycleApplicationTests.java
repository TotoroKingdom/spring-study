package com.totoro;

import com.totoro.bean.Bird;
import com.totoro.bean.User;
import com.totoro.config.WebConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringBeanLifecycleApplicationTests {

    /**
     * bean的初始化和销毁
     */
    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        User user = context.getBean(User.class);
        context.close();
    }

    //InitializingBean&DisposableBean
    @Test
    void InitializingBeanAndDisposableBeanTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        Bird bird = context.getBean(Bird.class);
        context.close();
    }

    //@PostConstruct&@PreDestroy
    @Test
    void PostConstructAndPreDestroy(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        context.close();
    }
}
