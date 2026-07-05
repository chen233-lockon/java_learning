package F02ReflectDemo;

//获取class对象的三种方式
//Class.forName("包名.类名");//只知道全限定类名（配置文件中读到的字符串）
//类名.class//编译期就知道类型
//对象.getClass()//已经有对象了
public class TestReflect01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        一
        Class<?> aClass = Class.forName("F02ReflectDemo.TestReflect01");
//        二
        Class<TestReflect01> bClass = TestReflect01.class;
//        三
        TestReflect01 testReflect01 = new TestReflect01();
        Class<?> cClass = testReflect01.getClass();
//
    }
}
