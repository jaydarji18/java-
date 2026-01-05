public class Operators{
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // Unary operators
        int c = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++c = " + (++c));  // Pre-increment
        System.out.println("c++ = " + (c++));  // Post-increment
        System.out.println("--c = " + (--c));  // Pre-decrement
        System.out.println("c-- = " + (c--));  // Post-decrement
        System.out.println("Unary minus: -" + c + " = " + (-c)); // Unary minus

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to

        // Logical operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT

        // Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));    // Bitwise AND
        System.out.println("a | b: " + (a | b));    // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b));    // Bitwise XOR
        System.out.println("~a: " + (~a));          // Bitwise NOT
        System.out.println("a << 2: " + (a << 2));  // Left shift
        System.out.println("a >> 2: " + (a >> 2));  // Right shift
        System.out.println("a >>> 2: " + (a >>> 2));// Unsigned right shift

        // Assignment operators
        System.out.println("\nAssignment Operators:");
        int d = 10;
        System.out.println("d += 5: " + (d += 5));  // d = d + 5
        System.out.println("d -= 5: " + (d -= 5));  // d = d - 5
        System.out.println("d *= 5: " + (d *= 5));  // d = d * 5
        System.out.println("d /= 5: " + (d /= 5));  // d = d / 5
        System.out.println("d %= 5: " + (d %= 5));  // d = d % 5

        // Ternary operator
        int min = (a < b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("min = (a < b) ? a : b = " + min);

    
    }
}
