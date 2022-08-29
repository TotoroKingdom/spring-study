package com.totoro.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
public class Fish {

    public Fish(){
        System.out.println("无参构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化Fish");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁Fish");
    }
}
