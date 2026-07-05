package Stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
//        可变性，线程不安全，（stringBuffer线程安全,性能略低）底层字节数组
//StringBuilder特别适用于需要频繁修改字符串的场景//常字符串拼接，然后转会string
//灵活操作字符串，提供丰富的API支持插入、替换、删除、反转等操作，简化字符串处理逻辑
//减少内存碎片，通过可变字符数组管理内存，避免频繁分配和回收小对象，降低内存碎片化风险
        show();
        showMethod();
    }
    public static void show(){
        //无参构造方法//初始默认长度16，满了自动扩容2倍 + 2
        StringBuilder sb = new StringBuilder();//创建一个长度为16的字符数组
        //带参数的构造方法
        StringBuilder sb1 = new StringBuilder(100);
        //基于字符串初始化
        //长度为10 + 16 = 26
        StringBuilder sb2 = new StringBuilder("helloWorld");
    }
    public static void showMethod(){
//        append(String str)末尾追加数据
//        insert(5,"HI")指定位置插入
//        replace(0,5,"HI")替换指定范围内的数据
//        reverse()反转
//        delete(start,end)
//        deleteCharAt(index)//删除指定位置的字符
//        substring(start,end)//截取指定范围的数据
//        charAt(index)//获取指定索引位置的字符
//        setCharAt(index,c)//设置指定索引位置的字符
//        length()//获取长度
//        capacity()//获取容量，初始16，满了自动扩容2倍 + 2
//        重写Object类的toString
//        toString()//将StringBuilder转换成String类

    }
}
