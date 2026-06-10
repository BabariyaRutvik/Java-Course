package Exercise.Part1;

import java.util.Scanner;

public class UserName
{
    static void main(String[] args) {

        String name = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.println("Hello "+name +" Welcome to Java");
    }
}
