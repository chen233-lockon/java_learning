package o_01ArrayList.Test01;

import java.util.ArrayList;

public class ExerciseDemo02 {
    public static void main(String[] args) {
        ArrayList<String> info = new ArrayList<>();
        info.add("test");
        info.add("张三");
        info.add("李四");
        info.add("test");
        info.add("test");
        System.out.println(info);
        deleteTest(info);
    }

    private static void deleteTest(ArrayList<String> info) {
        if (info == null || info.isEmpty()){
            System.out.println("集合为空");
            return;
        }
//        动态删除，索引值会改变，注意索引值改变(不推荐这样)
        for (int i = 0; i < info.size(); i++) {
            if("test".equals(info.get(i))){//使用"test"的equals方法
                System.out.println(info.remove(i));//动态删除，索引值会改变
                i--;
            }
        }
        //方法二、倒叙遍历删除，索引改变后，因为是倒序所有还是能正常删除
//        for (int i = info.size()-1; i >=0; i--) {
//            if("test".equals(info.get(i))){
//                System.out.println(info.remove(i));
//            }
//        }
        System.out.println(info);
    }
}
