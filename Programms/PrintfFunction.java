public class PrintfFunction {

    public static void main(String[] args) {
        //Integer
        int x = 5;
        System.out.printf("%-5d", x); // %- for left
        System.out.println();
        System.out.printf("%5d", x); // % for right
        System.out.println();
        
        //float
        double y = 30.3445;
        System.out.printf("%.2f", y);
        System.out.println();
        System.out.printf("%4.1f", y);
        System.out.println();
        
        // String
        String name="jay";
        System.out.printf("%-10s last", name);
        System.out.println();
        System.out.printf("%25s last", name);
        
        
        
    }
}



