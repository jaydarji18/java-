import java.util.Scanner;

public class customException{
    private double balance ;
    public void createacc(double balance){
        this.balance = balance;
    }

    public void deposite(double amount){
        balance = balance + amount;
        System.out.println("Balance : "+balance);
    }

    public void withdraw(double amount) throws MyException{
        if (amount > balance) {
            throw new MyException();
        }
        else{
            balance = balance - amount;
            System.out.println("amount is debited and balance: "+balance);
        }
    }
    public static void main(String args[]){
    
        customException ce1 = new customException();

        ce1.createacc(500);
        ce1.deposite(500);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double amounttowithdraw = sc.nextDouble();
        try{
            ce1.withdraw(amounttowithdraw);
        }
        catch(MyException e){
            System.out.println("Message :"+e.getMessage());

            System.out.println("toString: " + e.toString());

            System.out.println("\nprintStackTrace:");
            e.printStackTrace();

            System.out.println("\nStack Trace (getStackTrace):");
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }

        }
        finally{
            sc.close();
        }
    }

}

class MyException extends Exception{
    MyException(){
        super("insufficient balance");
    }
}