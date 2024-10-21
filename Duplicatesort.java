public class Duplicatesort {
        public static void main(String[] args) {
        int[] arr = {0, 1, 1, 3, 10, 15, 15};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
           
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i]; 
            }
        }
        temp[j++] = arr[arr.length - 1];    
        System.out.print("Sorted array without duplicates: ");
        for (int i = 0; i < j; i++) { 
            System.out.print(temp[i] + " ");
        }
    }
}