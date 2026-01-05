class carinsuperkeyword{
    int a =10;

    carinsuperkeyword(){
        System.out.println("Superclass's constructor");
    }

    void display(){
        System.out.println("Superclass's method");
    }
}
class lamboinsuperkeyword extends carinsuperkeyword{
    int a=20;
    lamboinsuperkeyword(){
        super();  
        System.out.println("Subclass's constructor");
        display();
    }

    void display(){
        super.display();
        System.out.println("Subclass's method");
        
        System.out.println("Superclass's variable: "+ super.a);
    }



}

public class superkeyword{
    public static void main(String[] args) {
        new lamboinsuperkeyword();
    }
}