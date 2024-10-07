import java.util.Arrays;

public class deepakroses {
    public static void roses(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > target) right--;
            else if (sum < target) left++;
            else {
                System.out.println("Deepak should buy roses whose prices are " + arr[left] 
                                   + " and " + arr[right] + ".");
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[][] testCases = {{2, 40, 40, 80}, {5, 10, 2, 6, 8, 4, 10}};
        int[] targets = {80, 10};

        for (int i = 0; i < testCases.length; i++) {
            roses(Arrays.copyOfRange(testCases[i], 1, testCases[i][0] + 1), targets[i]);
            System.out.println();
        }
    }
}
