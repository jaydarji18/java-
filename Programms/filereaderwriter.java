import java.io.*;
public class filereaderwriter{
    public static void main(String args[]){

        File inputfile = new File("E:/Aims/Java Basics/Programs/Files/EX1.txt");
        File outputfile = new File("E:/Aims/Java Basics/Programs/Files/EX2.txt");

        try{
            FileReader fr = new FileReader(inputfile);
            FileWriter fw = new FileWriter(outputfile);

            int i;
            while((i=fr.read()) != -1){
                System.out.println(i);
                fw.write(i);
            }
            fr.close();
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}