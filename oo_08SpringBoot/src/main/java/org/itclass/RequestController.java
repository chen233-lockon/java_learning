package org.itclass;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
//    Tomcat服务器会将浏览器的请求封装成HttpServletRequest对象
    public String request(HttpServletRequest  request){
//        1.获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式:" +  method);
//        2.获取请求的URL地址
        String url = request.getRequestURL().toString();
        System.out.println("请求URL:" +  url);// http://localhost:8080/request
        String requestURI = request.getRequestURI();// 获取请求的资源访问路径
        System.out.println("请求资源访问路径:" + requestURI);
//        3.获取协议
        String protocol = request.getProtocol();
        System.out.println("请求协议:" +  protocol);
//        4.获取请求参数
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("请求参数username:" +  username);
        System.out.println("请求参数age:" +  age);
//        5.获取请求头，(Accept为例）
        String accept = request.getHeader("Accept");// 获取请求头Accept
        System.out.println("请求头Accept:" +  accept);
        return "OK";
    }

}
