package com.alex.messagingstompwebsocket.Aop;

import org.springframework.stereotype.Component;

@Component
public class TestFunction {
    public void BeforeTest(){
        System.out.println("before test");
    }
}
