import java.util.*;

class student{
    String name;
    int enroll;

    student(int enroll, String name){
        this.enroll = enroll;
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getEnroll(){
        return enroll;
    }
}

class enrollcomp implements Comparator<student>{

    @Override
    public int compare(student s1, student s2) {
        return Integer.compare(s1.getEnroll(), s2.getEnroll());
    }
}

public class ComparatorExample{
    public static void main(String args[]){
        ArrayList<student> list = new ArrayList<student>();
        student s1 = new student(1009, "Jay");
        student s2 = new student(1011,"Heet");
        student s3 = new student(1005,"Dev");


        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Original List: ");
        for(student element : list){
            System.out.println(element.getEnroll()+" : "+element.getName()); 
        }

        // comparator by passing object of comparator
        Comparator<student> namecomp = new Comparator<student>() {
            public int compare(student s1, student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        Collections.sort(list, namecomp);
        
        System.out.println("\nSorted List by name: ");
        for(student element : list){
            System.out.println(element.getEnroll()+" : "+element.getName()); 
        }

        // comparator by implementing Comrator interface
        Collections.sort(list,new enrollcomp());
        System.out.println("\nSorted List by name: ");
        for(student element : list){
            System.out.println(element.getEnroll()+" : "+element.getName()); 
        }
    }
}