import java.io.*;

public class fileexample{
    public static void main(String args[]){
    
        File folder = new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files");
        File file1 = new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files\\file-1.txt");

        // another constructors to create object of file
        File file2 = new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files", "file-2.txt");
        // File pardir = new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files");
        // File file3 = new File(pardir, "example3.txt");

        try{
            System.out.println("\n");
            if(folder.mkdir()){
                System.out.println("Directory is created :"+folder.getName());
            }
            else{
                System.out.println("Directory is not created");
            }

            if(!file1.exists()){
                file1.createNewFile();
                System.out.println("File is created:"+file1.getName());
            }
            else{
                System.out.println("File already exists");
            }
            file2.createNewFile();

            System.out.println("\n");
            if(folder.isDirectory()){
                System.out.println(folder.getName()+" is directory");
            }
            else{
                System.out.println(folder.getName()+" is not directory");
            }

            if(file1.isFile()){
                System.out.println(file1.getName()+" is File");
            }
            else{
                System.out.println(file1.getName()+" is not File");
            }

            System.out.println("\n");
            System.out.println("Length of file 1: "+file1.length());
            System.out.println("Get absolute path of file 1: "+file1.getAbsolutePath());
            System.out.println("Get path of file 1:: "+file1.getPath());
            System.out.println("Get paraent: "+file1.getParent());
            
            if(file2.renameTo(new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files\\renamedfile.txt"))){
                System.out.println("File is renamed.");
            }
            else{
                System.out.println("File is not renamed.");
            }
        
            System.out.println("\nList file name:");
            String[] lname = folder.list();
            for(String item : lname){
                System.out.println(item);
            }

            System.out.println("\nList file paths");
            File[] lpath = folder.listFiles();
            for(File item : lpath){
                System.out.println(item);
            }

            System.out.println("File permissions for File - 1");
            System.out.println("Read: "+file1.canRead());
            System.out.println("Write: "+file1.canWrite());
            System.out.println("Execute: "+file1.canExecute());

            if(file1.delete()){
                System.out.println("File is deleted");
            }
            else{
                System.out.println("File can't delete.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}