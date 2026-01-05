import java.util.Scanner;

enum Enumimplement{
    // ADD{}, Subtract{}, Multiply{}, Division{};
    ADD{
        public void calculate(int a, int b){
            System.out.println("Addition : "+(a+b));
        }
    }, 
    Subtract{
        public void calculate(int a, int b){
            System.out.println("Subtract : "+(a-b));
        }
    }, 
    Multiply{
        public void calculate(int a, int b){
            System.out.println("Multiplication : "+(a*b));
        }
    }, 
    Divison{
        public void calculate(int a, int b){
            System.out.println("Division : "+(a/b));
        }
    };

    public abstract void calculate(int a, int b);
}

public class Enumexample{
    public static void main(String args[]){
        System.out.println("Enter two values:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Enumimplement.ADD.calculate(a,b);
        Enumimplement.Subtract.calculate(a,b);
        Enumimplement.Multiply.calculate(a,b);
        Enumimplement.Divison.calculate(a,b);

        sc.close();
    }
}