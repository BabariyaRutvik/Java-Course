public class datatypes_variables 
{
    public static void main(String[] args) {
        // --- 1. PRIMITIVE DATA TYPES ---

        // byte: 8-bit signed integer. Value range: -128 to 127
        byte aByte = 127;

        // short: 16-bit signed integer. Value range: -32,768 to 32,767
        short aShort = 32767;

        // int: 32-bit signed integer. Value range: -2^31 to 2^31-1 (standard for whole numbers)
        int anInt = 2147483647;

        // long: 64-bit signed integer. Value range: -2^63 to 2^63-1. Note the 'L' or 'l' suffix.
        long aLong = 9223372036854775807L;

        // float: Single-precision 32-bit IEEE 754 floating point. Note the 'F' or 'f' suffix.
        float aFloat = 3.14f;

        // double: Double-precision 64-bit IEEE 754 floating point. (Standard for decimal numbers)
        double aDouble = 3.141592653589793;

        // char: A single 16-bit Unicode character. Enclosed in single quotes.
        char aChar = 'A';

        // boolean: Can store only true or false.
        boolean aBoolean = true;


        // --- 2. NON-PRIMITIVE / REFERENCE DATA TYPES ---

        // String: A sequence of characters. Enclosed in double quotes.
        String aString = "Hello, Java!";

        // Array: A container object that holds a fixed number of values of a single type.
        int[] anArray = {10, 20, 30, 40, 50};


        // --- PRINTING VALUES ---
        System.out.println("--- Java Primitive Data Types ---");
        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("char: " + aChar);
        System.out.println("boolean: " + aBoolean);

        System.out.println("\n--- Java Non-Primitive Data Types ---");
        System.out.println("String: " + aString);
        System.out.println("Array element at index 0: " + anArray[0]);
        System.out.println("Array element at index 2: " + anArray[2]);
    }
}

