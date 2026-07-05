package F02ReflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射操作方法
//使用invoke方法调用方法
public class TestMethod05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<User> userClass = User.class;
        User user1 = new User(18, "张三");
        User user2 = new User(19, "李四");
//        getMethod获取指定的方法
        Method show1Method = userClass.getMethod("show");
//        使用invoke方法调用方法
        Object invoke = (String)show1Method.invoke(user1);
        System.out.println(invoke);
        System.out.println("----------------------");
//         getMethod获取带参数的方法
        Method show2Method = userClass.getMethod("show", String.class,int.class,String.class);
        show2Method.invoke(user2,"王五",18,"上海");//无返回值
        System.out.println("----------------------");
//        调用静态方法
        Method studyMethod = userClass.getMethod("study");
        studyMethod.invoke(null);

    }
}
