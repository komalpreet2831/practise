import java.util.*;
public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int power = 1;
        System.out.println("Powers of 2 less than or equal to 2^" + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }

        
    }
}
