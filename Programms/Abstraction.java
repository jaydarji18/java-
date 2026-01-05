abstract class Animalinabstraction{
    Animalinabstraction(){
        System.out.println("Inside super class constructor");
    }

    public abstract void show();
}

class Doginabstraction extends Animalinabstraction{
    public void show(){
        System.out.println("Dog");
    }
}

class Catinabstraction extends Animalinabstraction{
    public void show(){        
        System.out.println("Cat");
    }
}

// class Animalimplement{
//     public static void show(Animalinabstraction d){
//         d.show();
//     }
// }

public class Abstraction{
    public static void main(String[] args) {

        Animalinabstraction d1 = new Doginabstraction();
        Animalinabstraction c1 = new Catinabstraction();

        d1.show();
        c1.show();

        // Animalimplement.show(c1);
        // Animalimplement.show(d1);
    }
}