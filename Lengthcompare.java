 import java.util.Scanner;

public class Lengthcompare {
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for the first line:");
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates for the second line:");
        System.out.print("x3: ");
        int x3 = sc.nextInt();
        System.out.print("y3: ");
        int y3 = sc.nextInt();
        System.out.print("x4: ");
        int x4 = sc.nextInt();
        System.out.print("y4: ");
        int y4 = sc.nextInt();
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);

        if (length1 > length2) {
            System.out.println("The first line is longer.");
        } else if (length2 > length1) {
            System.out.println("The second line is longer.");
        } else {
            System.out.println("Both lines are of equal length.");
        }
        System.out.println("Length of first line: " + length1);
        System.out.println("Length of second line: " + length2);
    }
}

