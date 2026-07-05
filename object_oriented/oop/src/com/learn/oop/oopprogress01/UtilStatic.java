package com.learn.oop.oopprogress01;
//工具类，聚焦于解决某些问题，封装一些方法
//1.类名见名知意
//2.私有化构造方法 private UtilStatic()不让外部类创建（new）对象
//3.所有方法都是静态方法 static，直接通过类名调用
public class UtilStatic {
    private UtilStatic(){}//私有化构造方法
    //定义方法全部静态，不然外部类不能调用
//    [1,2,3,4,5,6]样式返回数组样式的字符串
//    调用方式1.类名.方法名(推荐),2.对象名.方法名(不推荐)
    public static String printArr(int[] arr){
//        直接打印方式
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i ==arr.length-1) System.out.print(arr[i] + "]");
//            else System.out.print(arr[i] + ",");
//        }
//        返回字符串方式
        String result= "[";
        for (int i = 0; i < arr.length; i++) {
            if(i ==arr.length-1) result += arr[i] + "]";
            else result += arr[i] + ",";
        }
        return result;
    }
//    返回平均数
    public  static double getAverage(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return 1.0*sum/arr.length;
    }
}
