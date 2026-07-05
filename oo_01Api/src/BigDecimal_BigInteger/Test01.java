package BigDecimal_BigInteger;

import java.math.BigDecimal;
import java.math.RoundingMode;

//大数
//BigDecimal解决浮点数精度丢失问题
public class Test01 {
    public static void main(String[] args) {
//        double d1 = 0.1;
//        double d2 = 0.2;
//        System.out.println(d1 + d2);//精度缺失
        //    BigDecimal使用
//        BigDecimal b1 = new BigDecimal(0.1);//仍然丢失精度,不推荐
//        BigDecimal b2 = new BigDecimal(0.2);
        BigDecimal b1 = new BigDecimal("0.1");//推荐字符串
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal b4 = BigDecimal.valueOf(0.1);//也推荐
        BigDecimal b5 = BigDecimal.valueOf(0.2);
        System.out.println("-------加法----------");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("-----------------");
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b4.add(b5));
        System.out.println("--------减法---------");
        System.out.println(b1.subtract(b2));
        System.out.println("--------乘法---------");
        System.out.println(b1.multiply(b2));
        System.out.println("--------除法---------");
//        (除数，保留的小数位，舍入模式（枚举类）)
        System.out.println(b1.divide(b2,4, RoundingMode.HALF_UP));
        System.out.println("-----------------");
    }

}
