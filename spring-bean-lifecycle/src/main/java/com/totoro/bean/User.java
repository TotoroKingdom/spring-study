package com.totoro.bean;

/**
 * @author:totoro
 * @createDate:2022/8/29
 * @description:
 */
public class User {
    public User(){
        System.out.println("无参构造创建User");
    }

    public void init(){
        System.out.println("初始化User");
    }

    public void destroy(){
        System.out.println("销毁User");
    }
}
