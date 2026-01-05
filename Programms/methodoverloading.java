class testcarinstanceofop{
    int a,b;
    float c;
    void display(){
        System.out.println("Hello java");
    }
    void display(int a){
        System.out.println("A: "+a);
    }
    void display(int a,int b){
        System.out.println("A+B: "+(a+b));
    }
    void display(int a,double c){
        System.out.println("A+c: "+(a+c));
    }
}

public class methodoverloading{
    public static void main(String args[]){
    	testcarinstanceofop t1 = new testcarinstanceofop();
        t1.display();
        t1.display(10);
        t1.display(10, 20);
        t1.display(10, 20.5);
    }
}
