package F03AnnotationDemo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
 * */
/**
 * 生命周期
 * 1.源码阶段，只在源码阶段可见
 * 2.字节码阶段,只在字节码阶段可见,但是加载字节码时会被删除(默认)
 * 3.运行阶段，在运行时可见
 * */
//限制注解使用位置
//    Value =可省略
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE})
//保留注解，指定注解的生命周期,通过枚举类RetentionPolicy获取
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
//    类似抽象方法，不能有形参
//    添加属性
    String name() default "张三";
    int age() default 18;
}
