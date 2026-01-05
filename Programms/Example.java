
class example1{
    int a;

    void setter(int b){
        a=b;
    }

    int getter(){
        return a;
    }
}


public class Example{
    public static void main(String[] args) {
        example1 ea = new example1();
        ea.setter(10);
        System.out.println(ea.getter());
    }
}