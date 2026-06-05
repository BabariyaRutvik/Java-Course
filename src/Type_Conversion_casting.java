public class Type_Conversion_casting {
    public static void main(String[] args) {
        System.out.println("=== Java Type Conversion and Casting Demonstration ===");
        System.out.println();

        // 1. Implicit Type Conversion (Widening Casting)
        // Happens automatically when passing a smaller type to a larger type size.
        // byte -> short -> char -> int -> long -> float -> double
        System.out.println("--- 1. Implicit Type Conversion (Widening) ---");
        int integerVal = 100;
        long longVal = integerVal; // int to long
        double doubleVal = longVal; // long to double

        System.out.println("Original int value: " + integerVal);
        System.out.println("Implicitly converted to long: " + longVal);
        System.out.println("Implicitly converted to double: " + doubleVal);
        System.out.println();

        // 2. Explicit Type Casting (Narrowing Casting)
        // Must be done manually by placing the target type in parentheses in front of the value.
        // double -> float -> long -> int -> char -> short -> byte
        System.out.println("--- 2. Explicit Type Casting (Narrowing) ---");
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int (decimals are truncated)

        System.out.println("Original double value: " + myDouble);
        System.out.println("Explicitly cast to int (fractional part truncated): " + myInt);

        // Advanced narrowing (overflow check)
        int largeInt = 257;
        byte myByte = (byte) largeInt; // byte range is -128 to 127. 257 % 256 = 1.
        System.out.println("Original large int value: " + largeInt);
        System.out.println("Explicitly cast to byte (undergoes modulo reduction): " + myByte);
        System.out.println();

        // 3. Type Promotion in Expressions
        // When evaluating expressions, Java automatically promotes intermediate types.
        System.out.println("--- 3. Type Promotion in Expressions ---");
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // The expression: (f * b) + (i / c) - (d * s)
        // (f * b) -> float * byte is promoted to float
        // (i / c) -> int / char is promoted to int
        // (d * s) -> double * short is promoted to double
        // The result of float + int - double is promoted to double.
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("Expression components:");
        System.out.println("  (float * byte): " + (f * b) + " [Type: float]");
        System.out.println("  (int / char): " + (i / c) + " [Type: int, char 'a' has ASCII value 97]");
        System.out.println("  (double * short): " + (d * s) + " [Type: double]");
        System.out.println("Final promoted expression result: " + result + " [Type: double]");
        System.out.println();

        // 4. Character and Integer Conversions
        System.out.println("--- 4. Character & Integer Conversions ---");
        char letter = 'A';
        int asciiValue = letter; // Implicit conversion of char to int (widening)
        System.out.println("Character: " + letter);
        System.out.println("ASCII value of character: " + asciiValue);

        int code = 66;
        char symbol = (char) code; // Explicit cast of int to char (narrowing)
        System.out.println("Integer code: " + code);
        System.out.println("Character symbol from code: " + symbol);
    }
}
