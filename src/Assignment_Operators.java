public class Assignment_Operators
{
    public static void main(String[] args) {
        System.out.println("=== Java Assignment Operators Demonstration ===");
        System.out.println();

        // 1. Simple Assignment (=)
        int num = 10;
        System.out.println("Simple Assignment (=):");
        System.out.println("  num = " + num);
        System.out.println();

        // 2. Compound Arithmetic Assignment
        System.out.println("Compound Arithmetic Assignment:");
        
        // Addition assignment (+=)
        num += 5; // Equivalent to: num = num + 5
        System.out.println("  num += 5  -> num = " + num);

        // Subtraction assignment (-=)
        num -= 3; // Equivalent to: num = num - 3
        System.out.println("  num -= 3  -> num = " + num);

        // Multiplication assignment (*=)
        num *= 4; // Equivalent to: num = num * 4
        System.out.println("  num *= 4  -> num = " + num);

        // Division assignment (/=)
        num /= 6; // Equivalent to: num = num / 6
        System.out.println("  num /= 6  -> num = " + num);

        // Modulus assignment (%=)
        num %= 5; // Equivalent to: num = num % 5
        System.out.println("  num %= 5  -> num = " + num);
        System.out.println();

        // 3. Compound Bitwise/Logical Assignment
        System.out.println("Compound Bitwise/Logical Assignment:");
        int bitwiseNum = 12; // Binary: 1100
        System.out.println("  Initial bitwiseNum = " + bitwiseNum + " (Binary: 1100)");

        // Bitwise AND assignment (&=)
        bitwiseNum &= 10; // 12 & 10 -> 1100 & 1010 = 1000 (Decimal 8)
        System.out.println("  bitwiseNum &= 10  -> bitwiseNum = " + bitwiseNum + " (Binary: 1000)");

        // Bitwise OR assignment (|=)
        bitwiseNum |= 3; // 8 | 3 -> 1000 | 0011 = 1011 (Decimal 11)
        System.out.println("  bitwiseNum |= 3   -> bitwiseNum = " + bitwiseNum + " (Binary: 1011)");

        // Bitwise XOR assignment (^=)
        bitwiseNum ^= 9; // 11 ^ 9 -> 1011 ^ 1001 = 0010 (Decimal 2)
        System.out.println("  bitwiseNum ^= 9   -> bitwiseNum = " + bitwiseNum + " (Binary: 0010)");
        System.out.println();

        // 4. Compound Shift Assignment
        System.out.println("Compound Shift Assignment:");
        int shiftNum = 8; // Binary: 1000
        System.out.println("  Initial shiftNum = " + shiftNum + " (Binary: 1000)");

        // Left Shift assignment (<<=)
        shiftNum <<= 2; // Equivalent to shiftNum = shiftNum << 2; (Binary: 100000 -> Decimal 32)
        System.out.println("  shiftNum <<= 2   -> shiftNum = " + shiftNum + " (Binary: 100000)");

        // Right Shift assignment (>>=)
        shiftNum >>= 3; // Equivalent to shiftNum = shiftNum >> 3; (Binary: 100 -> Decimal 4)
        System.out.println("  shiftNum >>= 3   -> shiftNum = " + shiftNum + " (Binary: 100)");

        // Unsigned Right Shift assignment (>>>=)
        int negativeNum = -8;
        System.out.println("  Initial negativeNum = " + negativeNum);
        negativeNum >>>= 2; // Shifts unsigned right (fills with zeros on the left)
        System.out.println("  negativeNum >>>= 2 -> negativeNum = " + negativeNum + " (Unsigned shift fills zeros)");
    }
}
