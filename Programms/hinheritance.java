class Ainhinheritance{
    int a=10;
}

class Binhinheritance extends Ainhinheritance{
    int b;
    int sumwithb(){
        return a+b;
    }
}

class Cinhinheritance extends Ainhinheritance{
    int c;
    int sumwithc(){
        return a+c;
    }
}

public class hinheritance{
    public static void main(String[] args) {

        Binhinheritance b1 = new Binhinheritance();
        b1.b=20;

        Cinhinheritance c1 = new Cinhinheritance();
        c1.c=30;

        System.out.println("A+B: "+b1.sumwithb());
        System.out.println("A+B: "+c1.sumwithc());
    }
}