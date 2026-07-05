package org.itclass.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.itclass.entity.User;
import java.util.List;

//注解说明：
//- @Mapper注解：表示是mybatis中的Mapper接口
//程序运行时，框架会自动生成接口的实现类对象(代理对象)，并给交Spring的IOC容器管理
//- @Select注解：代表的就是select查询，用于书写select查询语句
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
