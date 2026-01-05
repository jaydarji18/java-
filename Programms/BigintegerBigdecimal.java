import java.math.*;

public class BigintegerBigdecimal{
    public static void main(String args[]){
        BigInteger bi1 = new BigInteger("123456789123456789123456789");
        BigInteger bi2 = new BigInteger("987654321987654321987654321");

        BigInteger sum = bi1.add(bi2);
        System.out.println(sum);
        
        BigDecimal bd1 = new BigDecimal("12345.67890");
        BigDecimal bd2 = new BigDecimal("09876.54321");

        BigDecimal difference = bd2.subtract(bd1);
        System.out.println(difference);

    }
}
