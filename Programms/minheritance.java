interface Ainminheritance{
    //int num1
    void displayA();
}

interface Binminheritance{
    //int num2;
    void displayB();
}

class Cinminheritance implements Ainminheritance,Binminheritance{
    public void displayA(){
        System.out.println("showing A from C.");
    }

    public void displayB(){
        System.out.println("showing B from C.");
    }
}

public class minheritance{
    public static void main(String[] args) {
        Cinminheritance c = new Cinminheritance();
        c.displayA();
        c.displayB();
    }
}