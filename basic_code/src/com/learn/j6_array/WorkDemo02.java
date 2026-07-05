package com.learn.j6_array;

public class WorkDemo02 {
//    需求:定义一个方法，用于比较两个int数组的内容是否相同
//    要求 :  长度, 内容, 顺序完全相同才算相同。
//    注意非空判断都为null应该相同
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {1,2,3,4};
        System.out.println(isEqual(arr1, arr2));
    }
    public static boolean isEqual(int[]a1,int[] a2){
        boolean flag = false;
        if (a1 == a2) return !flag;//包含了a1 == null || a2 == null
        else if(a1 == null || a2 == null) return flag;
        else if(a1.length != a2.length ) return  flag;
        else{
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) return flag;
            }
            return !flag;
        }
    }
}
