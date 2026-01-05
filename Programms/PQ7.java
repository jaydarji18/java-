class Account{
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    public synchronized void withdraw(double amount){
        if(amount < balance){
            balance = balance-amount; 
            System.out.println("\n"+Thread.currentThread().getName()+" withdraws "+amount+" and available balance is "+balance);
        }
        else{
            System.out.println("\nInsufficient balance for "+ Thread.currentThread().getName());
        }
    }
    double getbalance(){
        return balance;
    }
}

class Threadd extends Thread{
    Account account;
    double amount;
    Threadd(Account account,String name,double amount){
        super(name);
        this.account=account;
        this.amount=amount;
    }

    public void run(){
        account.withdraw(amount);
    }

} 

public class PQ7{
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account(5000);

        Threadd th1 = new Threadd(acc1,"Jay",1000);
        Threadd th2 = new Threadd(acc1,"jitendra",2000);
        Threadd th3 = new Threadd(acc1,"chandrikaben", 1500);
        Threadd th4 = new Threadd(acc1,"vinodbhai", 2000);



        System.out.println("\nInitial balance: "+acc1.getbalance());
        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}