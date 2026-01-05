import java.math.*;

public class scaleandrouding{
    public static void main(String args[]){
        BigDecimal bi1 = new BigDecimal("10.0");
        BigDecimal bi2 = new BigDecimal("3.0");
        BigDecimal bi3 = new BigDecimal("1234.5678768");

        BigDecimal division= bi1.divide(bi2,3,RoundingMode.HALF_UP);
        System.out.println(division);

        System.out.println(bi3.setScale(3,RoundingMode.HALF_DOWN));
    }
}