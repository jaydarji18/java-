class animalmethodoverriding{
    void display(){
        System.out.println("Inside animal's method");
    }
}

class dogmethodoverriding extends animalmethodoverriding{
    void display(){
        System.out.println("Inside dog's method");
    }
}
public class methodoverriding{
    public static void main(String args[]){
        dogmethodoverriding d1 = new dogmethodoverriding();
        d1.display();
    }
}
