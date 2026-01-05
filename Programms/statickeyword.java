class carinstatickeyword{
    static String name = "Thar";
    static int year = 2020;

    public static void display(){  
        System.out.println("Car name is: "+name+ " and it's buying year: "+year);
    }

    static {
        System.out.println("This is static block");
    }
}

public class statickeyword{
    public static void main(String args[]){

        System.out.println("Car : "+ carinstatickeyword.name);
        System.out.println("year: "+ carinstatickeyword.year);

        carinstatickeyword.display();
    }
}