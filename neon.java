import java.util.Scanner;

public class neon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input number from the user
            int number = sc.nextInt();

            // Check if the number is a neon number
            if (isNeonNumber(number)) {
                System.out.println("Given number is a Neon number");
            } else {
                System.out.println("Given number is not a Neon number");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        sc.close();
    }

    public static boolean isNeonNumber(int n) {
        // Calculate the square of the number
        int square = n * n;
        // Calculate the sum of digits of the square
        int digitSum = 0;
        while (square != 0) {
            digitSum += square % 10;
            square /= 10;
        }
        // Check if the sum is equal to the original number
        return digitSum == n;
    }
}
