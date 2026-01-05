// Design an interface Payment with an abstract method pay(). Implement this interface in two 
// classes, CreditCardPayment and PayPalPayment, each providing a specific implementation of the pay() 
// method.

interface payment{
    void pay();

    // variable is final and static in interface so need to initialize
}

class CreditCardPayment implements payment{
    double amount;
    String name;

    CreditCardPayment(int amount){
        this.amount = amount;
        name= "Credit card";
    }

    public void pay(){
        System.out.println("Payment of "+amount+" is done. Payment mode:"+name);
    }
}

class PayPalPayment implements payment{
    double amount;
    String name;

    PayPalPayment(int amount){
        this.amount = amount;
        name= "Pay pal";
    }
    
    public void pay(){
        System.out.println("Payment of "+amount+" is done. Payment mode:"+name);
    }
}

public class Interfaceexample{
    public static void main(String[] args) {
        CreditCardPayment payment1 = new CreditCardPayment(1000);
        payment1.pay();

        PayPalPayment payment2 = new PayPalPayment(2000);
        payment2.pay();
    }
}
























// interface aimalininterfaceexample{
//     void sound();

//     default void eat(){
//         System.out.println("Animal is eating");
//     }
// }

// class dogininterfaceexample implements aimalininterfaceexample{
//     @Override
//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class catininterfaceexample implements aimalininterfaceexample{
//     @Override
//     public void sound() {
//         System.out.println("cat meows");
//     }
// }

// public class interfaceexample{
//     public static void main(String args[]){
//         dogininterfaceexample dog = new dogininterfaceexample();
//         catininterfaceexample cat = new catininterfaceexample();

//         dog.sound();
//         cat.sound();

//     }
// }