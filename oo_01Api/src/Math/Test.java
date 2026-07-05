package Math;
//Math类数学库,常用的如下
public class Test {
    public static void main(String[] args) {
        System.out.println("绝对值" + Math.abs(-10));
        System.out.println("----------------");
        System.out.println("向上取整" + Math.ceil(10.1));
        System.out.println("向下取整" + Math.floor(10.9));
        System.out.println("四舍五入" + Math.round(10.5));
        System.out.println("----------------");
        System.out.println("最大值" + Math.max(10,20));
        System.out.println("最小值" + Math.min(10,20));
        System.out.println("----------------");
        System.out.println("幂运算" + Math.pow(2, 3));
        System.out.println("平方根" + Math.sqrt(9));
        System.out.println("----------------");
//        底层就是java.util.Random的nextdouble()方法
        System.out.println("随机数" + Math.random());//[0.0-1.0)
    }
}
