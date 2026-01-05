class animal{
    void display(){
        System.out.println("Inside animal's method");
    }
}

class dog extends animal{
    @Override
    void display(){
        System.out.println("Inside dog's method");
    }
}

class cat extends animal{
    void display(){
        System.out.println("Inside cat's method");
    }
}
public class DynamicMethodDispatch{
    public static void main(String args[]){
        animal a1 = new animal();
        dog d1 = new dog();
        cat c1 = new cat();

        animal ref;

        // ref= a1;
        // ref.display(); 

        ref = d1;
        ref.display();

        // ref = c1;
        // ref.display();
    }
}