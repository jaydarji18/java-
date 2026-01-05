import java.io.*;

public class inputstreamreaderwriter{
    public static void main(String[] args) {
        File inputfile = new File("E://Aims//JAVA//Basics//Programs//Files//Example1.txt");
        File outputfile = new File("E://Aims//JAVA//Basics//Programs//Files//Example2.txt");

        try{
            InputStreamReader isr = new InputStreamReader(new FileInputStream(inputfile));
            OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(outputfile));

            int data;
            while((data=isr.read()) != -1){
                isw.write(data);
            }

            isr.close();
            isw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}