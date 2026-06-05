public class Logical_Operators {
    public static void main(String[] args) {
        System.out.println("=== Java Logical Operators Demonstration ===");
        System.out.println();

        boolean x = true;
        boolean y = false;

        System.out.println("Values: x = " + x + ", y = " + y);
        System.out.println();

        // 1. Logical AND (&&)
        // Returns true if both conditions are true.
        System.out.println("1. Logical AND (&&):");
        System.out.println("   x && x: " + (x && x));
        System.out.println("   x && y: " + (x && y));
        System.out.println("   y && y: " + (y && y));
        System.out.println();

        // 2. Logical OR (||)
        // Returns true if at least one condition is true.
        System.out.println("2. Logical OR (||):");
        System.out.println("   x || y: " + (x || y));
        System.out.println("   y || y: " + (y || y));
        System.out.println();

        // 3. Logical NOT (!)
        // Reverses the logical state of its operand.
        System.out.println("3. Logical NOT (!):");
        System.out.println("   !x: " + (!x));
        System.out.println("   !y: " + (!y));
        System.out.println();

        // 4. Short-Circuit behavior demonstration
        System.out.println("4. Short-Circuit Evaluation Demonstration:");
        
        // In &&, if the first operand is false, the second is not evaluated.
        System.out.println("   Checking: (false && evaluate())");
        boolean result1 = (false && checkIfEvaluated());
        
        // In ||, if the first operand is true, the second is not evaluated.
        System.out.println("   Checking: (true || evaluate())");
        boolean result2 = (true || checkIfEvaluated());
    }

    private static boolean checkIfEvaluated() {
        System.out.println("   -> [Warning] This method was evaluated!");
        return true;
    }
}
