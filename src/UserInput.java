import java.util.Scanner;

public class UserInput
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , b;

        System.out.print("Enter 1st Number: ");
        a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        b = sc.nextInt();

        int sum = a + b;

        System.out.println("The Sum Of Two Numbers are: "+sum);
    }
}
