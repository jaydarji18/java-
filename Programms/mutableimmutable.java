class testinmutableimmutable{
    int a,b;
    
    // void suma(){
    //     a = a + 5;
    //     System.out.println("value of mutable A:"+a);
    //     System.out.println("Sum of A:"+a);
    // }

    void mutable(int a){
        this.a=a;
        System.out.println("Before sum, A: "+a);
        a +=5;
        System.out.println("After sum, A: "+a);
    }

    int immutable(int a){
        return b+5;
    }
}

public class mutableimmutable {
    public static void main(String args[]){
        testinmutableimmutable t1 = new testinmutableimmutable();
        t1.b=5;

        System.out.println("Mutable:");
        t1.mutable(5);

        System.out.println("\nImmutable:");
        System.out.println("Before sum, B:"+t1.b);
        int num = t1.immutable(t1.b);
        System.out.println("sum from immutable method: "+num);
        System.out.println("After sum, B: "+t1.b);
        

    }

    
}
