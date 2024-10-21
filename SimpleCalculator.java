import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
      
        if (operator == '+') {
            result = num1 + num2;
        } 
        else if (operator == '-') {
            result = num1 - num2;
        } 
        else if (operator == '*') {
            result = num1 * num2;
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } 
            else {
                System.out.println("Error! Division by zero.");
                return;
            }
        } 
        else 
        {
            System.out.println("Invalid operation.");
            return;
        }
        System.out.println("The result is: " + result);
    }
}
