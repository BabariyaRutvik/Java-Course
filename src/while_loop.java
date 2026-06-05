public class while_loop 
{
    public static void main(String[] args) {
        // Example 1: Basic counter using a while loop
        System.out.println("--- Counting from 1 to 5 ---");
        int count = 1; // 1. Initialization
        while (count <= 5) { // 2. Condition
            System.out.println("Count: " + count);
            count++; // 3. Incrementation (prevents infinite loop)
        }
    }
}
