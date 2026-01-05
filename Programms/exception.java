import java.io.*;

class exceptionexample {
    public static void checkedexception(){
        try{
            FileReader fr = new FileReader("text.txt");
            fr.read();
            fr.close();
        }
        catch(Exception e){
            System.out.println("exception caught: "+e);
        }
        finally{
            System.out.println("checked expetion is successfull."); 
            
        }
    }

    public static void uncheckedexception(){
        int a=10,b=0;
        try{
            int div = a/b;
            System.out.println("division is "+div);
        }
        catch(Exception e){
            System.out.println("exception caught: "+e);
        }
        finally{
            System.out.println("unchecked expetion is successfull.");   
        }
    }
}


public class exception {
    public static void main(String args[]) {
        exceptionexample.checkedexception();
        exceptionexample.uncheckedexception();
    }
}
