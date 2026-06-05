public class Ternary_Operator {
    public static void main(String[] args) {
        System.out.println("=== Java Ternary Operator Demonstration ===");
        System.out.println();

        // 1. Basic usage - Max of two numbers
        int num1 = 15;
        int num2 = 25;
        int max = (num1 > num2) ? num1 : num2;
        
        System.out.println("Comparing numbers: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Using (num1 > num2) ? num1 : num2 -> Max value is: " + max);
        System.out.println();

        // 2. Checking Even or Odd
        int checkNum = 42;
        String type = (checkNum % 2 == 0) ? "Even" : "Odd";
        System.out.println("Checking number: " + checkNum);
        System.out.println("Using (checkNum % 2 == 0) ? \"Even\" : \"Odd\" -> Result: " + type);
        System.out.println();

        // 3. Nested Ternary Operator
        // Check if number is Positive, Negative, or Zero
        int n = -5;
        String description = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
        System.out.println("Checking number: " + n);
        System.out.println("Using (n > 0) ? \"Positive\" : (n < 0) ? \"Negative\" : \"Zero\" -> Result: " + description);
    }
}
