package com.learn.oop.oopprogressJavaBean.Exercise02;

public class Test {
    public static void main(String[] args) {
//练习 继承的作业4（电商项目）
//        业务场景：
//        某电商平台需要管理商品，基础商品包含名称、价格
//        行为：showInfo()展示所有的属性
//        要求子类按照要求，扩展特有属性
//        电子产品：
    //        增加品牌、型号
    //        行为：打印名称，价格，品牌，型号等所有属性
//        服装：
    //        增加尺寸、颜色
    //        行为：打印名称，价格，尺寸，颜色等所有属性功能，但是具体的工作内容又不一样。
        ElectronicProducts e = new ElectronicProducts("HuaWei P90", 5000, "HuaWei", "256G");
        e.showInfo();
        System.out.println("-----------------");
        ClothProduction c = new ClothProduction("T恤", 20, "香奈儿", "黑色");
        c.showInfo();
    }
}
