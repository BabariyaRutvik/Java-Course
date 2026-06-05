import java.util.Scanner;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Enter 1st Number: ");
        a = scanner.nextInt();

        System.out.print("Enter 2nd Number: ");
        b = scanner.nextInt();

        System.out.println("\n=== Arithmetic Operations ===");
        
        // Addition
        int sum = a + b;
        System.out.println("Addition (a + b)        = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction (a - b)     = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication (a * b)  = " + product);

        // Division
        if (b != 0) {
            int quotient = a / b;
            double divisionExact = (double) a / b;
            System.out.println("Integer Division (a / b) = " + quotient + " (truncates fractional part)");
            System.out.println("Exact Division (a / b)   = " + divisionExact);
        } else {
            System.out.println("Division (a / b)        = Cannot divide by zero!");
        }

        // Modulus (Remainder)
        if (b != 0) {
            int remainder = a % b;
            System.out.println("Modulus (a % b)         = " + remainder + " (remainder of division)");
        } else {
            System.out.println("Modulus (a % b)         = Modulo by zero is undefined!");
        }

        scanner.close();
    }
}
