class carinobjectclass{
    String name;
    String color;
    int year;
    
    public void cardetails(){
        System.out.println("\nCar details: \nName: "+name+"\nColor :"+color+"\nyear: "+year);
    } 
}

public class objectclass{
    public static void main(String args[]){
        carinobjectclass obj = new carinobjectclass();
        obj.name = "Mahindra thar";
        obj.color = "Red";
        obj.year = 2019;
        obj.cardetails();

        // assigning a object as reference
        carinobjectclass obj2 = new carinobjectclass();
        obj2.cardetails();
    }
}