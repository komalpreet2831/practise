public class duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array

        // Function call to check if any value appears at least twice
        int result = checkDuplicates(array);

        // Printing the result
        System.out.println(result);
    }
    public static int checkDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return 1; // If any value appears at least twice
                }
            }
        }
        return 0; // If every element is distinct
    }
}