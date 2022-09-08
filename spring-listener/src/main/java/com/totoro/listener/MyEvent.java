package com.totoro.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author:totoro
 * @createDate:2022/9/8
 * @description:
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
