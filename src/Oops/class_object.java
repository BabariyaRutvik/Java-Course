package Oops;

import java.util.Scanner;

class Calculator {

    public void Add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }
    public void Substract(int a , int b){
        int sub = a - b;
        System.out.println("Substraction: " +sub);
    }
    public void Multiplication(int a , int b){
        int mul = a * b;
        System.out.println("Multiplication: "+ mul);
    }
    public void Division(int a, int b) {
        if (b != 0) {
            double div = (double) a / b;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
    }
}

public class class_object 
{
    // The main method MUST be public so the JVM can run it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int x = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int y = sc.nextInt();

        // Create an Object of the Calculator class
        Calculator calc = new Calculator();

        // Call the methods using the object
        System.out.println("\n--- Results ---");
        calc.Add(x, y);
        calc.Substract(x, y);
        calc.Multiplication(x, y);
        calc.Division(x, y);

        sc.close();
    }
}

