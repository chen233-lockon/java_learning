package F01FrameWorkDemo;
//Bootstrap class loader：虚拟机的内置类加载器，C++ 实现,  获取到的只能是null
//Platform class loader：平台类加载器,负责加载 JDK中一些特殊的模块
//Application class loader(SystemClassLoader)：负责加载自己写的类
public class TestClassLoader {
    public static void main(String[] args) {
//        字节码对象
        Class<String> stringClass = String.class;
//        获取类加载器
        System.out.println(stringClass.getClassLoader());
    }
}
