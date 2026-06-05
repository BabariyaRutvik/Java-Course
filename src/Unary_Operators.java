public class Unary_Operators {
    public static void main(String[] args) {
        System.out.println("=== Java Unary Operators Demonstration ===");
        System.out.println();

        int num = 10;
        System.out.println("Initial Value: num = " + num);
        System.out.println();

        // 1. Unary Plus (+) & Unary Minus (-)
        System.out.println("1. Unary Plus (+) and Minus (-):");
        int positive = +num; // Indicates positive (default, redundant but valid)
        int negative = -num; // Negates the value
        System.out.println("   +num = " + positive);
        System.out.println("   -num = " + negative);
        System.out.println();

        // 2. Increment Operator (++)
        System.out.println("2. Increment Operator (++):");
        int x = 5;
        System.out.println("   Initial x = 5");
        
        // Post-Increment (use value first, then increment)
        System.out.println("   Post-Increment (x++): " + (x++)); // Prints 5, then x becomes 6
        System.out.println("   Value of x after Post-Increment: " + x);

        // Pre-Increment (increment first, then use value)
        System.out.println("   Pre-Increment (++x):  " + (++x)); // Increments x to 7, then prints 7
        System.out.println("   Value of x after Pre-Increment:  " + x);
        System.out.println();

        // 3. Decrement Operator (--)
        System.out.println("3. Decrement Operator (--):");
        int y = 5;
        System.out.println("   Initial y = 5");

        // Post-Decrement (use value first, then decrement)
        System.out.println("   Post-Decrement (y--): " + (y--)); // Prints 5, then y becomes 4
        System.out.println("   Value of y after Post-Decrement: " + y);

        // Pre-Decrement (decrement first, then use value)
        System.out.println("   Pre-Decrement (--y):  " + (--y)); // Decrements y to 3, then prints 3
        System.out.println("   Value of y after Pre-Decrement:  " + y);
        System.out.println();

        // 4. Logical Complement Operator (!)
        System.out.println("4. Logical Complement (!):");
        boolean flag = true;
        System.out.println("   flag = " + flag);
        System.out.println("   !flag = " + (!flag));
    }
}
