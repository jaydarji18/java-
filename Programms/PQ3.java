// Practical question: given an abstract class employee with an abstract method calculatesalary(), 
// create subclasses fulltimeemployee and parttimeemployee that implement this method.
import java.util.*;

abstract class employeeinpqthree{
    abstract void calculatesalary();
}

class fulltimeemployee extends employeeinpqthree{
    int id;
    double salary;
    fulltimeemployee(int id, double salary){
        this.id = id;
        this.salary = salary;
    }

    void calculatesalary(){
        System.out.println(id+" is a full time employee and his/her salary is "+salary);
    }
}

class parttimeemployee extends employeeinpqthree{
    int id;
    String name;
    double workhours;
    double salaryperhour;
    parttimeemployee(int id,double salaryperhour, double workinghour){
        this.id = id;
        this.salaryperhour = salaryperhour;
        this.workhours = workinghour;
    }

    void calculatesalary(){
        double salary = salaryperhour * workhours;
        System.out.println(id+" is a part time employee and his/her salary is "+salary);
    }
}

public class PQ3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Select one: \n1)Full time employee \n2)Part time employee");

        int selection = sc.nextInt();
        switch(selection){
            case 1:
                System.out.println("Enter Id:");
                int id = sc.nextInt();
                System.out.println("Enter Salary:");
                double salary = sc.nextDouble();
                fulltimeemployee fte1 = new fulltimeemployee(id, salary);
                fte1.calculatesalary();
                break;

            case 2:
                System.out.println("Enter Id:");
                int idd = sc.nextInt();
                System.out.println("Enter Salary per hour:");
                double salaryy = sc.nextDouble();
                System.out.println("Enter working hours:");
                double workinghour = sc.nextDouble();
                parttimeemployee pte1 = new parttimeemployee(idd, salaryy, workinghour);
                pte1.calculatesalary();
                break;

            default:
                System.out.println("Wrong choice");
                break;
            
        }
        sc.close();

    }
}