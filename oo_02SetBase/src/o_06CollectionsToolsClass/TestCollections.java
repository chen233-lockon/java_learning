package o_06CollectionsToolsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//java.util.Collections不属于集合，是用来操作集合的工具类
public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b张三");
        list.add("e王五");
        list.add("a赵六");
        list.add("c张三");
        System.out.println(list);
//        Collections.addAll()批量向单列集合添加元素
        Collections.addAll(list,"JAVA","PYTHON","C++");
        System.out.println(list);
//        Collections.shuffle()打乱集合元素顺序，前提有序操作ArrayList
        Collections.shuffle(list);
        System.out.println(list);
//        Collections.max/min()获取最大值/最小值
//        可以传入比较器对象，自定义比较规则
        System.out.println(Collections.max(list));
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18));
        list1.add(new Student("李四", 20));
        list1.add(new Student("王五", 19));
        Comparator<Student> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
        System.out.println(Collections.max(list1, comparator));
//        Collections.sort(),同理可以传比较器

}
}
