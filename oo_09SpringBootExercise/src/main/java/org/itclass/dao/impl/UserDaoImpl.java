package org.itclass.dao.impl;

import cn.hutool.core.io.IoUtil;
import org.itclass.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
//
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public List<String> findAll() {
//        也可以通过springboot自带的ResourceUtils工具类获取文件
//        File file = ResourceUtils.getFile("classpath:emp.txt");
//        List<String> lines = Files.readAllLines(file.toPath());
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> list = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return list;
    }
}
