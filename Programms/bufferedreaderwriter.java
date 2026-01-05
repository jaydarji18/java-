import java.io.*;

public class bufferedreaderwriter {
    File inputfile = new File("E:/Aims/Java Basics/Programs/Files/EX1.txt");
    File outputfile = new File("E:/Aims/Java Basics/Programs/Files/EX2.txt");

    // BufferedReader br = null;
    // BufferedWriter bw = null;
    // BufferedReader brinput= null;
    public static void main(String args[]) throws IOException {

        bufferedreaderwriter obj = new bufferedreaderwriter();
        obj.takeInput();
        obj.fromFile();
    }
    public void takeInput() throws IOException{
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.print("Enter the text: ");
            String s = br.readLine();
            System.out.println("You entered: "+s);

            System.out.print("Enter the number: ");
            String n = br.readLine();
            System.out.println("You entered: "+n);

            in.close();
            br.close(); 
        }

        catch(IOException e){
            System.out.println(e);
        }
    }

    public void fromFile() throws IOException {
        try{
            char[] buffer = new char[20];

            BufferedReader br = new BufferedReader(new FileReader(inputfile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile));

            //Method-1
            // int size = br.read(buffer, 0, 20);
            // bw.write(buffer, 0, 10);
            // bw.newLine();
            // bw.write(buffer, 10, size - 10);

            // Method-2
            // String input = br.readLine();
            // bw.write(size1, 0, input.length());

            br.close();
            bw.close();

        }
        catch(IOException e){
            System.out.println(e);
        }

        // String output = buffer.toString();
        // System.out.println("File contents: "+output);

    }
    // public static void toFile() throws IOException{}
}