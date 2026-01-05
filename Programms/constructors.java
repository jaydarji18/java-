// Class representing a simple model for a Car
class carinconstructors {
    
    private String make;
    private String model;
    private int year;

    // Default constructor
    public carinconstructors() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public carinconstructors(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called.");
    }

    // Copy constructor
    public carinconstructors(carinconstructors car) {
        this.make = car.make;
        this.model = car.model;
        this.year = car.year;
        System.out.println("Copy constructor called.");
    }

    // Method to display car details
    public void display() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class constructors {
    public static void main(String[] args) {
        // Using the default constructor
        System.out.println("Creating car1 using default constructor:");
        carinconstructors car1 = new carinconstructors();
        car1.display();

        // Using the parameterized constructor
        System.out.println("\nCreating car2 using parameterized constructor:");
        carinconstructors car2 = new carinconstructors("Toyota", "Camry", 2020);
        car2.display();

        // Using the copy constructor
        System.out.println("\nCreating car3 using copy constructor:");
        carinconstructors car3 = new carinconstructors(car2);
        car3.display();
    }
}
