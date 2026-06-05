public class do_while 
{
    public static void main(String[] args) {
        // Example: Printing numbers from 1 to 5 using a do-while loop
        System.out.println("--- Counting from 1 to 5 ---");
        int count = 1; // 1. Initialization
        do {
            System.out.println("Count: " + count);
            count++; // 2. Incrementation
        } while (count <= 5); // 3. Condition (evaluated after the loop body runs)
    }
}


