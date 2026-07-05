package F02ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestUserController04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        /**
         * 1.获取UserController字节码对象
         * 2.获取UserController空参构造器
         * 3.使用空参构造器创建UserController对象
         * 4.获取UserServerImp字节码对
         * 5.获取UserServerImp空参构造器对象
         * 6.使用空参构造器创建UserServerImp对象
         * 7.通过字节码获取UserController的属性userServer
         * 8.为UserController的属性userServer字段赋值
         * */
//        获取字节码对象
        Class<UserController> userControllerClass = UserController.class;
        Class<UserServerImp> userServerClass = UserServerImp.class;
//        获取构造器对象
        Constructor<UserController> userControllerClassConstructor = userControllerClass.getConstructor();
        Constructor<UserServerImp> userServerClassConstructor = userServerClass.getConstructor();
//        创建对象
        UserController userController = userControllerClassConstructor.newInstance();
        UserServer userServerImp = userServerClassConstructor.newInstance();
//      装配
//        获取属性字段
        Field userServerField = userControllerClass.getDeclaredField("userServer");
//        赋值
//        暴力赋值
        userServerField.setAccessible(true);
        //将 UserServerImp 对象赋值给 userController 的 userServer 字段
        userServerField.set(userController, userServerImp);
//        测试
        System.out.println(userController);
        System.out.println(userController);
    }
}
