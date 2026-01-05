class testinscopeofvariable{
    int instancevar=10; //instance variable

    static int staticvar=30;// static variable

    public void show(){
        int localvar=20;

        System.out.println("Instance var :"+instancevar);
        System.out.println("Local var :"+localvar);
    }
}

public class scopeofvariable{
    
    public static void main(String args[]){
    	testinscopeofvariable t1 = new testinscopeofvariable();
        t1.show();

        System.out.println(testinscopeofvariable.staticvar);

        for(int i=0 ; i<3 ; i++){
            System.out.println(i);
        }

        // system.out.prinln(i); // i variable cant access outside for loop
    }
}