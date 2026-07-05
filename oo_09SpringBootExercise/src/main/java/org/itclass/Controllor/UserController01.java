package org.itclass.Controllor;

import jakarta.annotation.Resource;
import org.itclass.pojo.User;
import org.itclass.service.UserService;
import org.itclass.service.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//RestController是@Controller加上@ResponseBody注解
@RestController
public class UserController01 {
//    private UserService userService = new UserServiceImpl();
//    理解Spring中的控制反转(IOC)和依赖注入(DI)
//    @Component就代表把当前类产生的对象交给IOC容器管理
//    通过控制反转@Componet和依赖注入@Autowired(按照类型注入),将实例交给Spring管理,不要自己创建实例(为了降低耦合度)，通过DI(依赖注入)@Autowired注入
//    注意Component注解，有几个子注解用于实际业务注解，如@Controller(控制层)、@Service(服务层)、@Repository(数据访问层)，其余情况用@Component注解
//    注意：被注解的bean不一定生效，还需要组件扫描器@ComponentScan去扫描，并注册到IOC容器中。
//    但是@ComponentScan没有显式配置，但是实际上已经包含在了启动类声明注解 @SpringBootApplication 中，默认扫描的范围是启动类所在包及其子包。

//有三种注入方式：一、字段(属性)注入，二、setter注入，三、构造器注入
    //一、字段注入
//二、setter注入
//private UserService userService;
//@Autowired
//public void setUserService(UserService userService) {
//    this.userService = userService;
//}
//三、构造器注入
//注意：如果只有一个构造函数，@Autowired注解可以省略
//private UserService userService ;
//    @Autowired
//    UserController01(UserService userService) {
//    this.userService = userService;
//}
// ???问题：当一个接口有多个实现类，注入时如何区分？
//- @Primary在实现类加上@Primary注解，表示这个实现类是默认的实现类。
//- @Qualifier指定当前要注入的bean对象。 在@Qualifier的value属性中，指定注入的bean的名称，搭配@Autowired一起使用。
//- @Resource是按照bean的名称进行注入。通过name属性指定要注入的bean的名称。不写@Autowired
@Qualifier(value = "userServiceImpl")
@Autowired
//    @Resource(name = "userServiceImpl")
private UserService userService;
    @RequestMapping("/emps/list")
//    @RequestParam(required = false)的作用是将把URL上?后面的参数，绑定到Java方法的参数上。
//    required = false: 表示这个参数是可选的，默认为true，表示这个参数是必须的，不传则400。false，不传则为null。
//    且spring 会自动将参数值转换成对应的数据类型。比如将字符串1转换成Integer类型。
    public List<User> list(@RequestParam(required = false) String name,
                           @RequestParam(required = false) Integer gender,
                           @RequestParam(required = false) Integer job) {
        return userService.findByCondition(name, gender, job);
    }
}
