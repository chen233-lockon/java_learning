package com.learn.j7_algorithm;

public class AlgorithmDemo01 {
    public static void main(String[] args) {
//        删除指定的元素
//        给一个数组nums和一个值val，删除所有数组为val的元素
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
//        利用快慢指针实现
        int slot = 0;
        int fast = 0;
//        快指针查找元素
//        while(fast < nums.length){
////            判断是否为目标元素
//            if(nums[fast] == val){
////                如果是舍弃，快指针继续走
//                fast++;
//            }
//            else{
////                如果不是，将值赋值给慢指针，快慢指针同时移动
//                nums[slot] = nums[fast];
//                fast++;
//                slot++;
//            }
//        }
//        todo优化版本
        for(;fast < nums.length;fast++){
//            判断是否为目标元素
            if(nums[fast] != val){
                nums[slot] = nums[fast];
                slot++;
            }
        }

//        遍历输出。
//        注意慢指针的位置才是结束位置
        for (int i = 0; i < slot; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
