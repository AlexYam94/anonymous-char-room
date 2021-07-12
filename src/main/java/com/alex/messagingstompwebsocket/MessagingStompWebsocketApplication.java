package com.alex.messagingstompwebsocket;

import com.alex.messagingstompwebsocket.Aop.TestFunction;
import com.alex.messagingstompwebsocket.Config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//
//		TestFunction testFunction = context.getBean(TestFunction.class);
//		testFunction.BeforeTest();
//        context.close();
	}

}
