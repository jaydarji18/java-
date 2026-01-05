import java.io.*;
import java.util.*;

public class bytearrayiostream {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter msg:");
        String msg = sc.nextLine();
        byte[] inputarray = msg.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(inputarray);// hello from jay
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int data;
        int n=0;

        while ((data = bais.read()) != -1) {
            baos.write(data);
            System.out.println((char)data);
            if(data == 32){
                bais.mark(1024);
            }

            if(data == 109)
            {
                bais.reset();
                n++;
            }

            if(n == 2){
                break;
            }
            
        }

        // while((data = bais.read()) != -1){
        //     baos.write(data);
        //     System.out.println(data);
        // }

        byte[] outputarray = baos.toByteArray();
        String output = new String(outputarray); //hello from from
        System.out.println("output:" + output);
        sc.close();
    }
}