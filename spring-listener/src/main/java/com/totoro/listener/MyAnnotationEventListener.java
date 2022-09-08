package com.totoro.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2022/9/8
 * @description:
 */
@Slf4j
@Component
public class MyAnnotationEventListener {

    @EventListener
    public void onMyEventPublished(MyEvent myEvent){
        log.info("收到自定义事件MyEvent---- MyAnnotationEvent");
    }
}
