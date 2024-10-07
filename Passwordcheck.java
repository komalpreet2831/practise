import java.util.Scanner;
public class Passwordcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        System.out.println(isValidPassword(password) ? "Password is valid." :"Password is invalid. It must be at least 8 characters long, contain at least 2 numbers and 2 special characters.");
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 8)   
        return false;
        int numCount = 0, specialCharCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) numCount++;
            else if (!Character.isLetterOrDigit(ch)) specialCharCount++;
        }
        return numCount >= 2 && specialCharCount >= 2;
    }
}
