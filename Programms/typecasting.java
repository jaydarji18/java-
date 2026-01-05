public class typecasting{
    public static void main(String args[]){
        System.out.println("Implicit type casting:");
        int a = 10;
        double b = a;
        System.out.println("B:"+b);

        System.out.println("Explicit type casting:");
        double c =10.2;
        int d = (int)c;
        System.out.println("D:"+d);
    }
}