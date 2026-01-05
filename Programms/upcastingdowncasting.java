class animalinupcastingdowncasting {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class doginupcastingdowncasting extends animalinupcastingdowncasting {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class upcastingdowncasting {
    public static void main(String[] args) {
        
        //upcasting
        animalinupcastingdowncasting animal = new doginupcastingdowncasting();
        animal.sound();

        //downcasting
        doginupcastingdowncasting dog = (doginupcastingdowncasting)animal;
        dog.sound();
    }
}
