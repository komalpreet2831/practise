import java.util.Scanner;

public class sumlimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;

        // Input loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;

            // Check sum
            if (sum > 100) {
                System.out.println("Sum limit exceeded");
                return; // Exit the program if sum exceeds 100
            }
        }

        // Print sum if it doesn't exceed 100
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}