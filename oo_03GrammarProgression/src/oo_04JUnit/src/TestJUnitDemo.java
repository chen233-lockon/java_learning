package oo_04JUnit.src;

import org.junit.jupiter.api.Test;

//JUnit单元测试，不依赖mian方法测试，加@Test注解
//创建类包的名字不要为Test，避免与JUnit冲突
//类名规范XXXTest
//方法必须public，返回值void，参数为空
//点击类测试全部，不会被单个错误停止测试
public class TestJUnitDemo {
    @Test
    public void add(){
        System.out.println("add");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
//        int i = 10/0;
    }
}
