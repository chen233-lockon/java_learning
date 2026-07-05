package org.itclass;

import org.itclass.entity.Employee;
import org.itclass.entity.User;
import org.itclass.mapper.EmployeeMapper;
import org.itclass.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

@SpringBootTest
class Oo10SpringBootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
@Test
    public  void testFindAll(){
    List<User> users = userMapper.findAll();
    users.forEach(System.out::println);
}

@Test
    public void testDeleteById(){
     employeeMapper.deleteById(5);
    System.out.println("删除成功");
    }
@Test
    public  void testInsertEmployee(){
    Employee employee = new Employee();
    employee.setName("小王");
    employee.setImage("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
    employee.setGender(1);
    employee.setJob(1);
    employee.setSalary(5000);
    employee.setEntryDate(LocalDate.of(2023,1,1));
    employee.setCreateTime(LocalDateTime.now());
    employee.setUpdateTime(LocalDateTime.now());
    employeeMapper.insertEmployee(employee);
    System.out.println("添加成功");
    }
    @Test
    public void testUpdateEmployee(){
    Employee employee = new Employee();
    employee.setId(34);
    employee.setName("周姑娘");
    employee.setImage("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
    employee.setGender(1);
    employee.setJob(2);
    employee.setSalary(5800);
    employee.setEntryDate(LocalDate.parse("2024-05-05"));
    employee.setUpdateTime(LocalDateTime.now());
    employeeMapper.updateEmployee(employee);
    }
    @Test
    public void testSelectById(){
    Employee employee = employeeMapper.selectById(2);
    System.out.println(employee);
    }
    @Test
    public void testSelectByNameAndGender(){
    List<Employee> employees = employeeMapper.selectByNameAndGenderAndJob("李", 2, null);
    employees.forEach(System.out::println);
    }

}
