import java.io.*;

public class bufferediostream{
    public static void main(String args[]){
        File file1 = new File("E:/Aims/Java Basics/Programs/Files/EX1.txt");
        File file2 = new File("E:/Aims/Java Basics/Programs/Files/EX2.txt");

        try{

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1)); // AAAAABBBBBBBBBBCCCCCCCCCC
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));

            byte[] buffer = new byte[20];
            int bytesRead;  
            
            bytesRead = bis.read(buffer,0,5);
            bos.write(buffer,0,bytesRead); // AAAAA

            bytesRead = bis.read(buffer,0,5);
            bos.write(buffer,0,bytesRead); //AAAAABBBBB

            System.out.println(bytesRead);
            bis.mark(bytesRead);

            bytesRead = bis.read(buffer,0,5);
            bos.write(buffer,0,bytesRead); // AAAAABBBBBBBBBB

            bis.reset(); 
           
            bytesRead = bis.read(buffer,0,5);
            bos.write(buffer,0,bytesRead); // AAAAABBBBBBBBBBBBBBB
            
            bis.close();
            bos.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}
