package com.learn.oop.oopprogressExtends.oopprogressExtends04;

public class ThirdGenerationPhone  extends SecondGenerationPhone{
    public  void PlayGame(){
        System.out.println("手机正在打游戏");
    }

    @Override
//    @Override注解：告诉编译器，这个方法被重写
//    重写的方法申明和父类方法保持一致(名字和形参列表一致)
//    （权限修饰符必须大于等于父类方法（缺省>protected>public）
//    返回值类型必须小于等于父类方法）
//    private、static、final修饰的方法不能被重写
//    调用父类的方法，如果一点不想用，直接重写就行
//    如果需要用就可以通过super关键字调用父类的方法，再继续重写
    public void Call() {
        System.out.println("开启视频");
        System.out.println("手机正在打电话");
    }
}
