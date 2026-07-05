package o_01ArrayList.Exercise.Test01;

public class Test01 {
    public static void main(String[] args) {
//        定义一个静态方法 void test(int[] arr),该方法接收一个int[]数组，方法内部计算出该数组的最大值和最小值并打印出来。测试：在main方法中定义一个int型数组，数组元素有{2,3,-5,1,9,2}，并将该数组传入test方法中，调用测试看看结果是否正确。

    int[] arr = {2,3,-5,1,9,2};
    test(arr);

    }
    public static void test(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
            if (min > j) min = j;
        }
        System.out.println("最大值为:" + max + "最小值为:" + min);
    }
}
