public class maxfreq {
    public static void main(String[] args) {
        String input = "abccd"; // Example string
        char maxFreqChar = getMaxFrequencyChar(input);
        System.out.println(maxFreqChar);
    }

    public static char getMaxFrequencyChar(String s) {
        int[] frequencyArray = new int[128];
        char maxFreqChar = ' ';
        int maxFrequency = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = (int) currentChar;
            frequencyArray[index]++;
            
            if (frequencyArray[index] > maxFrequency) {
                maxFrequency = frequencyArray[index];
                maxFreqChar = currentChar;
            }
        }
        
        return maxFreqChar;
    }
}
