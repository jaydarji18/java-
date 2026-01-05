// Practical question: passing object of class as argument
class car{
    String name;
    String color;
    int year;
     
}
public class PQ2{
    public static void main(String args[]){ 
        car obj1 = new car();
        obj1.name="XUV 700";
        obj1.color="dark gray";
        obj1.year=2022;
        
        printcardetails(obj1);
    }

    public static void printcardetails(car c){
        System.out.println("\nCar details: \nName: "+c.name+"\nColor :"+c.color+"\nyear: "+c.year);
    }
}