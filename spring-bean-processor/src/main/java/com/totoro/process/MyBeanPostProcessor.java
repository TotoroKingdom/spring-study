package com.totoro.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2022/9/7
 * @description:
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("springBeanProcessorApplication".equals(beanName)){
            System.out.println("post processor before " + beanName + " initialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("springBeanProcessorApplication".equals(beanName)){
            System.out.println("post processor after " + beanName + " initialization");
        }
        return bean;
    }
}
