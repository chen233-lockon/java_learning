package org.itclass.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public static String hello(String name){
        System.out.println("HelloController ... hello : " + name);
        return "Hello " + name + " ~ ";
    }
}
