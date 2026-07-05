package BigDecimal_BigInteger;

import java.math.BigInteger;

//BigInteger大整数，任意大，不可变1，线程安全
public class Test02
{
    public static void main(String[] args) {
//        创建
//        字符串
        BigInteger b1 = new BigInteger("1234567890123456789012345678901234567890");
//        valueOf
        BigInteger b2 = BigInteger.valueOf(1000000000000L);
        System.out.println("---------取余--------");
        BigInteger remainder = b1.remainder(b2);//取余
        System.out.println( remainder);
        System.out.println("---------幂运算------------");
        System.out.println(b1.pow(2));
//        等
    }
}
