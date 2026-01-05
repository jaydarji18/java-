public class literalss {
    public static void main(String[] args) {
        // Integer literals
        int decimalLiteral = 100;           // Decimal (base 10)
        int octalLiteral = 0144;            // Octal (base 8)
        int hexLiteral = 0x64;              // Hexadecimal (base 16)
        int binaryLiteral = 0b1100100;      // Binary (base 2)

        // Floating-point literals
        float floatLiteral = 10.5f;
        double doubleLiteral = 10.5;

        // Boolean literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        // Character literals
        char charLiteral = 'A';
        char unicodeLiteral = '\u0041';     // Unicode for 'A'
        char escapeLiteral = '\n';          // Newline character

        // String literal
        String stringLiteral = "Hello, World!";

        // Null literal
        String nullLiteral = null;

        System.out.println("Integer Literals: " + decimalLiteral + ", " + octalLiteral + ", " + hexLiteral + ", " + binaryLiteral);
        System.out.println("Floating-Point Literals: " + floatLiteral + ", " + doubleLiteral);
        System.out.println("Boolean Literals: " + trueLiteral + ", " + falseLiteral);
        System.out.println("Character Literals: " + charLiteral + ", " + unicodeLiteral + ", " + escapeLiteral);
        System.out.println("String Literal: " + stringLiteral);
        System.out.println("Null Literal: " + nullLiteral);
    }
}
