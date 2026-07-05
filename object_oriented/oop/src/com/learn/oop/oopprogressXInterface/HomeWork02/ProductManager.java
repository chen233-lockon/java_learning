package com.learn.oop.oopprogressXInterface.HomeWork02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductManager {
    private  Product[]  products;
//    void deleteById(int id)方法：根据id删除商品
    void deleteById(int id){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getId() == id){
                products[i] = new Product();
                System.out.println("删除成功");
                return;
            }
        }
    }
//    void updateProduct（Product product）方法：根据传入新学生的id，修改商品信息（id一致才修改，否则不修改）
    void updateProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == product.getId()){
                products[i] = product;
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，没有找到该商品");
}
//Product findProductById（int id）方法：根据传入的id返回查询的Product对象，如果查询不到返回null
    Product findProductById(int id){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getId() == id){
                System.out.println("查询成功");
                return products[i];
            }
        }
        return null;
    }
    public void show(){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println("----------");
    }
}
