package org.itclass.service;

import org.itclass.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> findByCondition(String name, Integer gender, Integer job);
}
