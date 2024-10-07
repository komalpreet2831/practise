public class togglecase {
    public static void main(String[] args) {
        String str = "AnswEr";
        String toggledStr = toggleCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Toggled String: " + toggledStr);
    }

    public static String toggleCase(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans += (char) (ch - 32); // Lower to Upper
            } else if (ch >= 'A' && ch <= 'Z') {
                ans += (char) (ch + 32); // Upper to Lower
            } else {
                ans += ch; // Non-alphabetic characters remain unchanged
            }
        }
        return ans;
    }
}
