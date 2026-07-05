package org.itclass.service.imp;

import org.itclass.dao.UserDao;
import org.itclass.dao.impl.UserDaoImpl;
import org.itclass.pojo.User;
import org.itclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
//@Primary//默认使用这个类
@Service
public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImpl();//不要通过new创建对象，而是通过Spring容器创建对象
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return findByCondition(null, null, null);
    }

    @Override
    public List<User> findByCondition(String name, Integer gender, Integer job) {
        List<String> list = userDao.findAll();
        return list.stream().map(line -> {
            String[] userInfo = line.split(",");
            Integer id = Integer.parseInt(userInfo[0]);
            String userName = userInfo[1];
            String image = userInfo[2];
            Integer userGender = Integer.parseInt(userInfo[3]);
            Integer userJob = Integer.parseInt(userInfo[4]);
            LocalDate entryDate = LocalDate.parse(userInfo[5], DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDateTime updateTime = LocalDateTime.parse(userInfo[6], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, userName, image, userGender, userJob, entryDate, updateTime);
        }).filter(user -> {
            if (name != null && !name.isEmpty() && !user.getName().contains(name)) return false;
            if (gender != null && !gender.equals(user.getGender())) return false;
            if (job != null && !job.equals(user.getJob())) return false;
            return true;
        }).toList();
    }
}
