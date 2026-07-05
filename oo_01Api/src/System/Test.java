package System;
//System类功能都是静态的，直接类名调用
public class Test {
    public static void main(String[] args) {
//        exit()方法退出虚拟机
//        currentTimeMillis()方法获取当前时间毫秒值
//        arraycopy()方法将数组复制到新数组中
//            System.exit(4);//0表示正常退出，非0表示异常退出,退出代码
//        1970年1月1日0时0分0秒0毫秒
//        时间戳,可以用来生成随机数，就是random底层
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[20];
//        参数1：源数组，参数2：源数组的起始索引，参数3：目标数组，参数4：目标数组的起始索引，参数5：复制的个数
        System.arraycopy(arr1,0,arr2,0,10);

    }
}
