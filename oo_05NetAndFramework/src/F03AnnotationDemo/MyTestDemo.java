package F03AnnotationDemo;

import java.lang.reflect.Method;

public class MyTestDemo {
    public static void main(String[] args) {
//        将testMyTest添加了MyTest注解方法反射执行，模拟Junit
        Class<TestMyTest> aClass = TestMyTest.class;
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            MyTest annotation = method.getAnnotation(MyTest.class);//获取方法上的注解
//            没有返回null
            if (annotation != null){
//                是想要的方法，调用
//                method.invoke( null);
            }
        }
    }
}
