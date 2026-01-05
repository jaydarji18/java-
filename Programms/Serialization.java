/*
Serialization: converting object to byte stream
De-serialization: converting byte stream to object
 */

import java.io.*;

class Studentinser implements Serializable{
    int enr;
    String name;
    Studentinser(int enr, String name){
        this.enr = enr;
        this.name = name;
    }

    void show(){
        System.out.println(enr +" : "+ name);
    }
}

public class Serialization{
    public static void main(String args[]){
        Studentinser s1 = new Studentinser(1009, "Jay");
        Studentinser s2 = new Studentinser(1010, "DEV");


        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Aims/Java Basics/Programs/Files/EX1.txt"));
            oos.writeObject(s1);
            oos.writeObject(s2);

            System.out.println("Object is saved.");

            oos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        } 

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Aims/Java Basics/Programs/Files/EX1.txt"));
            Studentinser s5 = (Studentinser) ois.readObject();
            s5.show();

            Studentinser s6 = (Studentinser) ois.readObject();
            s6.show();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
