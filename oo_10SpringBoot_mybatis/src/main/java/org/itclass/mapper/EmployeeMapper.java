package org.itclass.mapper;

import org.apache.ibatis.annotations.*;
import org.itclass.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
//    Mybatis的提供的符号，有两个，一个是 #{...}，另一个是 ${...}
//符号	说明	场景	                                                            优缺点
//#{…}	占位符。执行时，会将#{…}替换为?，生成预编译SQL	参数值传递	                    安全、性能高 （推荐）
//${…}	拼接符。直接将参数拼接在SQL语句中，存在SQL注入问题	表名、字段名动态设置时使用	不安全、性能低
//    注解（sql语句）
//    方法
    @Delete("delete from employee where id = #{id}")
     void deleteById(Integer id);
    @Insert("insert into employee values (null,#{name},#{image},#{gender},#{job},#{salary},#{entryDate},#{createTime},#{updateTime})")
    void insertEmployee(Employee  employee);
    @Update("update employee set name = #{name},image = #{image},gender = #{gender},job = #{job},salary = #{salary},entry_date = #{entryDate},create_time = #{createTime},update_time = #{updateTime}  where id = #{id} ")
    void updateEmployee(Employee employee);
//    在Mybatis中，进行结果封装时，如果查询返回的字段名与实体类的属性名一致，框架会自动完成结果封装；如果不一致，就不能自动完成结果的封装。
//    结果就是三个数据不对应
//    解决方法：
//    方法一：sql查询后as起别名
//    方法二：驼峰命名
//    在application.yml中做如下配置，开启开关。
    //#驼峰命名映射开关
    //mybatis.configuration.map-underscore-to-camel-case=true
    @Select("select * from employee where id = #{id}")
    Employee selectById(Integer id);
//    多条件查询
//提示：@param注解的作用是为接口的方法形参起名字的 ，参数通过@Param注解指定的名字后，在#{}里面写的就是我们通过注解所制定的名字。
//说明:默认情况下，接口中定义的方法在编译成class字节码文件后，形参名称将不会被保留（var1, var2...类似这样），所以需要通过@Param注解来指定每一个参数的名字。
//但是基于官方骨架创建的springboot项目中，接口编译时会保留方法形参名，所以@Param注解可以省略 (#{形参名})。
//注意:
//- #{...} 是占位符，不能够出现在引号之内，如果出现在引号之内（如：name like '%#{name}%'），会被认为就是一个普通的字符串，而不是占位符。
//- 而${...}是可以出现在引号里的，因为${...}就是专门用来拼接字符串的。
//     concat('%',?,'%')预编译，别使用${},预防sql注入漏洞
//    @Select("select * from employee where name like concat('%',#{name},'%') and gender = #{gender} and job = #{job}")
    List<Employee> selectByNameAndGenderAndJob(@Param("name") String name, @Param("gender") Integer gender,@Param("job") Integer job);
//    使用Mybatis的注解方式，主要是来完成一些简单的增删改查功能。
//    如果需要实现复杂的SQL功能，建议使用XML来配置映射语句，也就是将SQL语句写在XML配置文件中
//    注意：Mybatis 中的SQL语句，要么基于注解配置，要么基于XML配置，只能二选一，不能同时配置，否则将会报错。
//1. XML映射文件的名称与Mapper接口名称一致，并且将XML映射文件和Mapper接口放置在相同包下（同包同名）
//2. XML映射文件的namespace属性为Mapper接口全限定名一致
//3. XML映射文件中sql语句的id与Mapper接口中的方法名一致，并保持返回类型一致。
//4. <select>标签中的 resultType 属性的值，与查询返回的单条记录封装的类型一致。
// 动态拆查询
//    动态SQL标签：
//            - <where>：只会在有成立的if条件时，才会插入WHERE子句，而且还会自动去除第一个条件前面多余的and/or。
//            - <if>：条件判断，在test属性中指定的条件成立时，才会拼接对应的SQL片段。
//使用XML方式实现多条查询，去掉了@Select注解
}
