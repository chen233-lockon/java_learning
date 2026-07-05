package org.itclass.Controllor;

import cn.hutool.core.io.IoUtil;
import org.itclass.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController//请求处理类//由@Controller注解和@ResponseBody注解组成
//内部封装了ResponseBody注解：将controller返回的数据作为响应体返回，如果是对象/集合，先转换为json数据再返回
public class UserController {
    @RequestMapping("/emps/list")
    public List<User> list() throws FileNotFoundException {
        //    1.读取User.txt文件，获取数据,通过HuTools工具类实现
//        不推荐InputStream in = new FileInputStream(new File("D:\\JavaProject\\oo_09SpringBootExercise\\src\\main\\resources\\user.txt"));
//        java和resources目录编译后都在一个文件夹下,推荐通过反射去拿文件
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> list = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        //    2.解析文件，封装为User对象->list对象
        List<User> userList = list.stream().map(line -> {
            String[] userInfo = line.split(",");
            Integer id = Integer.parseInt(userInfo[0]);
            String name = userInfo[1];
            String image = userInfo[2];
            Integer gender = Integer.parseInt(userInfo[3]);
            Integer job = Integer.parseInt(userInfo[4]);
            LocalDate entryDate = LocalDate.parse(userInfo[5], DateTimeFormatter.ISO_LOCAL_DATE );
//可以传DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")，指定格式
            LocalDateTime updateTime = LocalDateTime.parse(userInfo[6], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, name, image, gender, job,entryDate, updateTime);
        }).toList();
        //    3.返回Json格式的数据,ResponseBody注解会自动将对象、集合转为Json格式的数据
        return userList;
    }


}
