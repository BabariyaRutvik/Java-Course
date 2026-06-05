public class Relational_Operators {
    public static void main(String[] args) {
        System.out.println("=== Java Relational Operators Demonstration ===");
        System.out.println();

        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println();

        // 1. Equal to (==)
        System.out.println("1. Equal to (==):");
        System.out.println("   a == b: " + (a == b));
        System.out.println("   a == c: " + (a == c));
        System.out.println();

        // 2. Not equal to (!=)
        System.out.println("2. Not equal to (!=):");
        System.out.println("   a != b: " + (a != b));
        System.out.println("   a != c: " + (a != c));
        System.out.println();

        // 3. Greater than (>)
        System.out.println("3. Greater than (>):");
        System.out.println("   b > a:  " + (b > a));
        System.out.println("   a > b:  " + (a > b));
        System.out.println();

        // 4. Less than (<)
        System.out.println("4. Less than (<):");
        System.out.println("   a < b:  " + (a < b));
        System.out.println("   b < a:  " + (b < a));
        System.out.println();

        // 5. Greater than or equal to (>=)
        System.out.println("5. Greater than or equal to (>=):");
        System.out.println("   b >= a: " + (b >= a));
        System.out.println("   a >= c: " + (a >= c));
        System.out.println("   a >= b: " + (a >= b));
        System.out.println();

        // 6. Less than or equal to (<=)
        System.out.println("6. Less than or equal to (<=):");
        System.out.println("   a <= b: " + (a <= b));
        System.out.println("   a <= c: " + (a <= c));
        System.out.println("   b <= a: " + (b <= a));
    }
}
