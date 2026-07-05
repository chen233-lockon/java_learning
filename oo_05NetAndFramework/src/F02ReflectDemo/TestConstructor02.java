package F02ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//测试反射获取构造方法
public class TestConstructor02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //    1.获取字节码对象
        Class<User> userClass = User.class;
//    2.获取字节码对象中的构造对象
//        getConstructors()只能获取公有构造方法
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-------------------------");
//        getDeclaredConstructors()获取所有构造器
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        System.out.println("-------------------------");
//        getDeclaredConstructor获取指定的构造器（不定长带全参数的）传参数的字节码对象(基本类型也有对应的字节码对象)
        Constructor<User> constructor = userClass.getDeclaredConstructor(String.class, int.class);
        System.out.println( constructor);
//        利用构造器对象创建User对象
        System.out.println("-----------创建对象--------------");
//        1.newInstance()创建对象
//        会被修饰符限制，设置setAccessible(true)暴力反射无视修饰符
        constructor.setAccessible(true);
        User user = constructor.newInstance("张三", 23);
        System.out.println(user);
    }

}
