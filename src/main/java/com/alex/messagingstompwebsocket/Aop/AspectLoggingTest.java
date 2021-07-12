package com.alex.messagingstompwebsocket.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
@Component
@Service
public class AspectLoggingTest {

    @Pointcut("execution(* com.alex.messagingstompwebsocket.Aop.TestFunction.*(..))")
    private void testBefore(){
    }

    @Before("testBefore()")
    public void test1(){
        System.out.println("Before testBefore");
    }

    @After("testBefore()")
    public void test2(){
        System.out.println("After testBefore");
    }

}
