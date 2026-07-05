package BigDecimal_BigInteger;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Work {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_UP));
    }
}
