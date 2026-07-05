package o_05Set;

import java.util.Comparator;
import java.util.TreeSet;

//Set集合 存取数据无序，不能重复，没有索引
//TreeSet：元素排序(底层红黑树(自平衡的二叉树,根节点必须黑色,一样不存),综合增删改查都不错)
//HashSet：元素唯一(hash表)
//LinkedHashSet：元素唯一，保证存取顺序(),有序,继承自HashSet
//三种通用遍历方法
public class TreeSetDemo01 {
    public static void main(String[] args) {
//        TreeSet的自然排序
        TreeSet<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("c");
        ts.add("d");
        ts.add("e");
        System.out.println( ts);
//        TreeSet的比较器排序（优先级高），
//        方式一实现Comparable接口，重写compareTo方法
        System.out.println("----------------");
        TreeSet<Student> ts1 = new TreeSet<>();
        ts1.add(new Student("张三", 18));
        ts1.add(new Student("李四", 18));
        ts1.add(new Student("王五", 19));
        ts1.add(new Student("赵六", 20));
        System.out.println(ts1);
//        方式二在创建TreeSet对象时，传入Comparator接口的实现类对象，重写compare方法
        System.out.println("----------------");
//        创建Comparator接口的实现类对象
//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//      Comparator<Person> comparator = (o1,o2) -> o1.getAge() - o2.getAge();
//        compare是抽象的所以不能引用
        Comparator<Person> comparator = Comparator.comparingInt(Person::getAge);

        TreeSet<Person> ts2 = new TreeSet<>(comparator);
        ts2.add(new Person("张三", 18));
        ts2.add(new Person("李四", 18));
        ts2.add(new Person("王五", 19));
        ts2.add(new Person("赵六", 20));
        System.out.println(ts2);

    }
}
