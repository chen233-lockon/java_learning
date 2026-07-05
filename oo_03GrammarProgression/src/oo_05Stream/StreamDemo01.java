package oo_05Stream;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Stream流:配合Lambda表达式，简化集合和数组操作
//        Stream的思想
//        将数据放到流中（获取流对象）
//        中间方法(过滤、映射)
//        终结方法（输出、收集）
/**
 * 注意1：Stream不会修改原始数据
 * 注意2：一个流只能被消费一次
 * 注意3：只使用与单列集合使用，map要使用先entrySet()再使用Stream
 * **/
//拓展new Function，重写apply
//    new Function<原始类型, 想要映射的类型>() {
//@Override
//public String apply(String s) {
//    return s.split(",")[0];
//}
public class StreamDemo01
{
    public static void main(String[] args) {
    }
    @Test
    public void test0(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张良");
        list.add("王小利");
        list.add("张三");
        list.add("张翠山");
        list.add("张三丰");
        list.add("谢广坤");
//        传统方法
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3){
                list1.add(s);
            }
        }
        System.out.println(list1);
//        流的方法
        list.stream().
                filter(s ->  s.startsWith("张")).
                filter(s -> s.length() == 3).
                forEach(System.out::println);
    }
    @Test
    public void test1(){
//        一、将数据放到流中（获取流对象）
//           1.集合获取流对象
//            Collection.stream//只有单列集合可以
//           2.数组获取流对象
//            Arrays.stream
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).
                filter(x -> x % 2 == 0).
                forEach(System.out::print);
        System.out.println();
        System.out.println("----------");
//           3.零散数据获取流对象
//             Stream.of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //只要3的倍数的个数
        long count = stream.filter(x -> x % 3 == 0).count();
        System.out.println( count);
    }
    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张良");
        list.add("王小利");
        list.add("张三");
        list.add("张翠山");
        list.add("张三丰");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
//        二、中间方法(过滤、映射)
//        filter过滤
//        limit(long maxsize)限制个数
//        skip(long)跳过
//        sorted()排序
//        distinct()去重,依赖hashCode()和equals()
//        concat()合流,通过Stream.concat()类名调用
//        map()映射转换,传入Function接口重新apply()

        list.stream().
                limit(3).
                skip(1).
                forEach(System.out::println);
        System.out.println("----------");
        list.stream().
                distinct().
                forEach(System.out::println);
        System.out.println("----------");
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18));
        list1.add(new Student("李四", 19));
        list1.add(new Student("王五", 20));
        list1.add(new Student("赵六", 21));
        list1.add(new Student("哈哈", 30));
        list1.stream().map(Student::getAge).forEach(System.out::println);
        System.out.println("----------");
        Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> s2 = Stream.of(-1,-2,-3,-4,-5,-6,-7,-8,-9,-10);
        Stream<Integer> concated = Stream.concat(s1, s2);
        concated.filter(x -> x%2 ==0).sorted().forEach(System.out::println);
    }
    @Test
    public void test3(){
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18));
        list1.add(new Student("李四", 19));
        list1.add(new Student("王五", 26));
        list1.add(new Student("赵六", 27));
        list1.add(new Student("哈哈", 11));
        //        三、终结方法（输出、收集）
//        输出操作：forEach()
//        统计操作：count() max()(传入比较器返回optional对象使用get方法得到最大值)等
//        收集操作：collect(),只能用于对象流，不能用于数组流、基本流，需要boxed()先装箱
//        使用collect()的Colltectors工具类提供了具体的收集方法toList()toSet()toMap()
        //收集年纪小于25的数据
        List<Student> studentList = list1.stream().
                filter(student -> student.getAge() <= 25).
                collect(Collectors.toList());
//        List<Student> studentList = list1.stream().
//                filter(student -> student.getAge() <= 25).
//                toList();//toList()常用可以直接写
        System.out.println( studentList);
//        将数据转换成Map
        List<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");
        list.stream().
                collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split( ",")[1]))).
                forEach((k, v)-> System.out.println(k + "=" + v));

    }
}
