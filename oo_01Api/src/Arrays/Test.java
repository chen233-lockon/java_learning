package Arrays;

import java.util.Arrays;
import java.util.Comparator;

//Arrays
public class Test {
    public static void main(String[] args) {
        int[] a = {3,4,1,2,5};
        Arrays.sort( a);
        for (int i : a) {
            System.out.println( i);
        }
        System.out.println("-----------------");
        Student s1 = new Student("小王", 18);
        Student s2 = new Student("小李", 20);
        Student s3 = new Student("小张", 17);
        Student[] students = {s1,s2,s3};
//        1.sort排序
//        自定义规则排序数组（左减右升序，0，右减左降序）
//               方法一：创建一个类实现Comparable接口，并重写compareTo方法this和参数比较
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println( student);
        }
//  (推荐优先级高)方法二：多传递一个参数Comparator接口的实现类对象，重写compare方法，两个参数比较
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
//        2.toString()//工具类的静态方法toString和object类重写toString是两码事
        int[] arr = {1,2,3,4,5};
        System.out.println("---------------");
        System.out.println(Arrays.toString(arr));
//        3.binarySearch二分查找，前提是有序数组
        int[] arr1 = {1,8,3,5,6,7,4,2,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 9));
    }
}
