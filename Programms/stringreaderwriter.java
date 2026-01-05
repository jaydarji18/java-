import java.io.*;
import java.util.*;
public class stringreaderwriter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mail: ");
        String inputstring = sc.nextLine();

        try{
            StringReader sr = new StringReader(inputstring);
            StringWriter sw = new StringWriter();
            int data;
            while((data = sr.read()) != -1){
                sw.write(data);
            }
            sw.append("@gmail.com");

            //System.out.println("get buffer:"+ sw.getBuffer());
            String output = sw.toString();
            System.out.println("Output: "+output);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}