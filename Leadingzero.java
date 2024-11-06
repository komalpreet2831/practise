import java.util.Scanner;
public class Leadingzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;  // Reverse logic
            number /= 10;  // Reduce the original number
        }

        System.out.println("Reversed number: " + reversed);
    }
}




