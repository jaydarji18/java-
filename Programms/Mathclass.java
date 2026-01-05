public class Mathclass {
    public static void main(String args[]){

        System.out.println("\nAbsolute value of -4:"+Math.abs(-4));
        System.out.println("SQRT of 9:"+Math.sqrt(9));
        System.out.println("Power 2^5 :"+Math.pow(2,5));
        System.out.println("Min (10,8): "+Math.min(10,8));
        System.out.println("Max (10,8): "+Math.max(10,8));
        System.out.println("Ceil of 5.7:"+Math.ceil(5.7));
        System.out.println("floor of 5.7:"+Math.floor(5.7));
        System.out.println("round of 5.7:"+Math.round(5.7));
        System.out.println("Randome value:"+Math.round(Math.random()*100));

        System.out.println("\nsign num :"+Math.signum(10));
        System.out.println("sign num: "+Math.signum(-20));
        System.out.println("sign num: "+Math.signum(0));

        // result = square of value 1 + square of value 2;
        // sqrt(result)
        System.out.println("\nHypot(7,8): "+ Math.hypot(7,8));
        System.out.println("CBRT of 125: "+Math.cbrt(125));
        
    }
}