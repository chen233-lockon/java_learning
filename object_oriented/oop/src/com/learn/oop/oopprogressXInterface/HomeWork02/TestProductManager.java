package com.learn.oop.oopprogressXInterface.HomeWork02;

public class TestProductManager {
    public static void main(String[] args) {
        Product p1 = new Product(1,"小米",10);
        Product p2 = new Product(2,"华为",20);
        Product p3 = new Product(3,"苹果",30);
        Product[] products = {p1,p2,p3};
        ProductManager pm = new ProductManager(products);
        pm.deleteById(1);
        pm.show();
        pm.updateProduct(new Product(2,"华为",40));
        pm.show();
        System.out.println(pm.findProductById(2));
    }
}
