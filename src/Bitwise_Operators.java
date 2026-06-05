public class Bitwise_Operators {
    public static void main(String[] args) {
        System.out.println("=== Java Bitwise Operators Demonstration ===");
        System.out.println();

        int a = 5;  // Binary: 0000 0101
        int b = 7;  // Binary: 0000 0111

        System.out.println("Values: a = " + a + " (Binary: " + Integer.toBinaryString(a) + "), b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");
        System.out.println();

        // 1. Bitwise AND (&)
        // 0101 & 0111 = 0101 (Decimal 5)
        System.out.println("1. Bitwise AND (&):");
        System.out.println("   a & b = " + (a & b) + " (Binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println();

        // 2. Bitwise OR (|)
        // 0101 | 0111 = 0111 (Decimal 7)
        System.out.println("2. Bitwise OR (|):");
        System.out.println("   a | b = " + (a | b) + " (Binary: " + Integer.toBinaryString(a | b) + ")");
        System.out.println();

        // 3. Bitwise XOR (^)
        // 0101 ^ 0111 = 0010 (Decimal 2)
        System.out.println("3. Bitwise XOR (^):");
        System.out.println("   a ^ b = " + (a ^ b) + " (Binary: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println();

        // 4. Bitwise Complement (~)
        // ~5 = ~0000...0101 = 1111...1010 (Decimal -6 in 2's complement representation)
        System.out.println("4. Bitwise Complement (~):");
        System.out.println("   ~a = " + (~a) + " (Binary: " + Integer.toBinaryString(~a) + ")");
        System.out.println();

        // Shift Operators
        int n = 8; // Binary: 0000 1000
        System.out.println("Shift Operations on n = " + n + " (Binary: " + Integer.toBinaryString(n) + "):");

        // 5. Left Shift (<<)
        // Shifts bits to the left, fills with zeros. (Equivalent to multiplying by 2^shiftCount)
        System.out.println("5. Left Shift (<<):");
        System.out.println("   n << 2 = " + (n << 2) + " (Binary: " + Integer.toBinaryString(n << 2) + ")");
        System.out.println();

        // 6. Right Shift (>>)
        // Shifts bits to the right, fills with the sign bit (sign-extends). (Equivalent to dividing by 2^shiftCount)
        System.out.println("6. Right Shift (>>):");
        System.out.println("   n >> 2 = " + (n >> 2) + " (Binary: " + Integer.toBinaryString(n >> 2) + ")");
        System.out.println();

        // 7. Unsigned Right Shift (>>>)
        // Shifts bits to the right, fills with zeros regardless of sign.
        int negativeNum = -8;
        System.out.println("7. Unsigned Right Shift (>>>):");
        System.out.println("   Initial negative value: " + negativeNum + " (Binary: " + Integer.toBinaryString(negativeNum) + ")");
        System.out.println("   negativeNum >> 2 (Signed):   " + (negativeNum >> 2) + " (Binary: " + Integer.toBinaryString(negativeNum >> 2) + ")");
        System.out.println("   negativeNum >>> 2 (Unsigned): " + (negativeNum >>> 2) + " (Binary: " + Integer.toBinaryString(negativeNum >>> 2) + ")");
    }
}
