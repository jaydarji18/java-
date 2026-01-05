import java.io.*;

public class fileiostream{
    public static void main(String args[]) throws IOException{
        File file1 = new File("E:/Aims/Java Basics/Programs/Files/EX1.txt");
        File file2 = new File("E:/Aims/Java Basics/Programs/Files/EX2.txt");

        file1.createNewFile();
        file2.createNewFile();
        try{
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            
            int data;
            while((data=fis.read()) != -1){
                if(data == 106){
                    // System.out.println("available: "+fis.available());
                    fis.skip(106);
                }
                fos.write(data);
            }  

            fis.close();
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}