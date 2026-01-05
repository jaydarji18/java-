class testinthiskeyword{
    int x=10; //instance variable
    
    void display(){
        int x=20;
        System.out.println("Instance var:"+this.x);
        System.out.println("Local var:"+x);
    }
}

public class thiskeyword{
    public static void main(String[] args){
    	testinthiskeyword t=new testinthiskeyword();
        t.display();
    }
}