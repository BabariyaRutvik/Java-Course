import java.util.Scanner;

public class Odd_Even
{
    static void main() {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
