
interface A{
    void display1();
    // void display2();
}

public class Lambdaexpression{
    public static void main(String[] args) {
        A obj = () -> {
                System.out.println("inside 1");
            };
        obj.display1();

        A obj2 = () -> {
            System.out.println("Inside 2");
        };

        obj2.display1();
    }
}


// public class Lambda{
//     public static void main(String args[]){
//         Addition addition = (a,b)->a+b;
//         System.out.println(addition);
//     }
// }