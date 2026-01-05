// Practical question: program to search file in directory
import java.io.File;

public class PQ6 {
    public static void main(String[] args) {
        File folder = new File("E:\\Aims\\JAVA\\Basics\\Programs\\Files");
        String search = "File1.txt";

        if (searchFile(folder, search)) {
            System.out.println(search + " found");
        } else {
            System.out.println(search + " not found");
        }
    }

    public static boolean searchFile(File dir, String search) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        if (searchFile(file, search)) { // Return true if found in subdirectory
                            return true;
                        }
                    } else if (file.getName().equals(search)) {

                        return true; // File found
                    }
                }
            }
        }
        return false; // File not found
    }
}