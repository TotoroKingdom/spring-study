package com.totoro.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
public class Bird implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁Bird");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化Bird");
    }
}
