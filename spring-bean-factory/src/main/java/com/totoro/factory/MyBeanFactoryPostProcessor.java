package com.totoro.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2022/9/7
 * @description:
 */
@Slf4j
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor(){
        log.info("实例化MyBeanFactoryPostProcessor Bean");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        log.info("bean定义个数：" + beanDefinitionCount);
    }

    @Component
    static class TestBean{
        public TestBean(){
            log.info("实例化TestBean");
        }
    }
}
