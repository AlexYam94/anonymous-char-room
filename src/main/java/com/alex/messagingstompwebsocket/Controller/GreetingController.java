package com.alex.messagingstompwebsocket.Controller;

import com.alex.messagingstompwebsocket.Models.Greeting;
import com.alex.messagingstompwebsocket.Models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + ".");
        Greeting broadcastContent = new Greeting(HtmlUtils.htmlEscape(message.getName()) + ": " + HtmlUtils.htmlEscape(message.getMessage()));
        return broadcastContent;
    }
}
