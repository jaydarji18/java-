public class controlstatement {
    public static void main(String[] args) {
        int number = 10;

        // if statement
        System.out.println("if Statement:");
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        // if-else statement
        System.out.println("\nif-else Statement:");
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // if-else-if-else statement
        System.out.println("\nif-else-if-else Statement:");
        if (number < 0) {
            System.out.println(number + " is negative.");
        } else if (number == 0) {
            System.out.println(number + " is zero.");
        } else {
            System.out.println(number + " is positive.");
        }

        // nested if statement
        System.out.println("\nNested if Statement:");
        int age = 25;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            if (age >= 21) {
                System.out.println("You are eligible to apply for a driving license.");
            }
        }

        // switch statement
        System.out.println("\nSwitch Statement:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // for loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // nested loops
        System.out.println("\nNested Loops:");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println("m = " + m + ", n = " + n);
            }
        }
    }
}
