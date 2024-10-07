import java.util.Scanner;

public class balancedparan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        int result = checkBalancedParentheses(s);
        System.out.println(result);

        scanner.close();
    }

    public static int checkBalancedParentheses(String s) {
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) {
                    return 0; // Unbalanced parentheses
                }
                openCount--;
            }
        }

        return openCount == 0 ? 1 : 0;
    }
}
