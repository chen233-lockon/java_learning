package comMaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("用户服务测试类")
public class userServiceTest {
    @Test
     public  void test(){
            UserService userService = new UserService("张三",18);
        System.out.println(userService.getName());
        System.out.println(userService.getAge());
    }
//    断言（基于Assertions工具类中的各种assert方法）
    @Test
    public  void testGetGenderwithAssert(){
        UserService userService = new UserService("张三",18);
        String name = userService.getName();
//        System.out.println(userService.getAge());
//        断言工具类Assertions,判断断言
        Assertions.assertEquals("张三",name,"名字获取逻辑有问题");
    }
    @Test
    public  void testGetGenderwithAssert2(){
        UserService userService = new UserService("张三",18);
        String name = userService.getName();
//        断言工具类Assertions,异常断言
        Assertions.assertThrows(RuntimeException.class,()->{userService.show();});
    }
//    BeforeEach,AfterEach（再每一个之前或之后执行）BeforeAll,AfterAll(在整个之前或之后执行一次)
//    参数化测试ParameterizedTest,ValueSource
//    企业开发规范，考虑所有情况和边界值,正常值，异常值
    @DisplayName("测试用户性别")
    @ParameterizedTest
    @ValueSource(strings = {"张三","小王","小李"})
    public  void testUserService(String name){
        int age = 18;
        UserService userService = new UserService(name,age);
        Assertions.assertEquals("小李",userService.getName());
    }

}
