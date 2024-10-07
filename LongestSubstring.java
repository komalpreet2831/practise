public class LongestSubstring {
    public static void main(String[] args) {
        String sentence = "hello and welcome to chitkara"; // Input sentence
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }
    public static String findLongestWord(String sentence) {
        String longestWord = ""; 
        String currentWord = ""; 
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); 
            if (ch != ' ') {
                currentWord += ch; 
            } else {
               
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord; 
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord; 
        }
        return longestWord; 
    }
}
