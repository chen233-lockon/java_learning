package org.itclass;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {
    //    方法一: 使用HttpServletResponse对象
//    tomcat服务器将返回结果封装成HttpServletResponse对象
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
//        1.设置响应状态码
        response.setStatus(401);
//        2.设置响应头
        response.setHeader("name", "chentao");
//        3.设置响应体，通过流写写出
        response.getWriter().write("<h1>hello world</h1>");
    }

    //    方法二：Spring提供的ResponseEntity对象
    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity
                .status(200)
                .header("name", "fengxianlin")
                .body("<h1>hello 奉先琳</h1>");
    }
}
