interface anonymousinnerclass{
    void hello();
}

public class anonymousinnerclassexample{
    public static void main(String[] args) {
        anonymousinnerclass anonymous = new anonymousinnerclass(){
            public void hello(){
                System.out.println("hello");
            }
        };
        anonymous.hello();

        anonymousinnerclass object2 = new anonymousinnerclass() {
            public void hello(){
                System.out.println("world");
            }
        };
        object2.hello();
    }
}
