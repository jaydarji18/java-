import java.util.*;

public class throwandthrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e);
        }

        sc.close();
    }

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }
}
