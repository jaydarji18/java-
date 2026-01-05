class Ainmlinheritance{
    int a=10;
}

class Binmlinheritance extends Ainmlinheritance{
    int b=20;
}

class Cinmlinheritance extends Binmlinheritance{
    int c;
    int sumwithc(){
        return a*(b+c);
    }
}

public class mlinheritance{
    public static void main(String[] args) {

    	Cinmlinheritance c1 = new Cinmlinheritance();
        c1.c=30;

        System.out.println("a*(b+c): "+c1.sumwithc());
    }
}