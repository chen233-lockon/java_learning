package com.learn.oop.oopprogressExtends.oopprogressExtends04;
//访问继承的成员方法特点，和成员变量类似，遵循就近原则，且使用this和super访问
//重点：方法的重写@Override
public class Test {
    public static void main(String[] args) {
//        第三代需要重写父类的call方法
/*第一代手机
*   功能：打电话
* 第二代手机
*   功能：打电话，发短信
* 第三代手机
*   功能：打电话升级为视频通话(方法重写)，发短信,打游戏
*
* */
//       创建第一代的手机
        System.out.println("---------第一代手机---------");
        FirstGenerationPhone phone1 = new FirstGenerationPhone();
        phone1.Call();
//       创建第二代的手机
        System.out.println("---------第二代手机---------");
        SecondGenerationPhone phone2 = new SecondGenerationPhone();
        phone2.Call();
        phone2.SendMessage();
//       创建第三代的手机
        System.out.println("---------第三代手机---------");
        ThirdGenerationPhone phone3 = new ThirdGenerationPhone();
        phone3.Call();
        phone3.SendMessage();
        phone3.PlayGame();
    }
}
