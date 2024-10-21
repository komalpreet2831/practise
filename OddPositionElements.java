public class OddPositionElements {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Elements in odd positions:");
        for (int i = 0; i < array.length; i += 2) { 
            System.out.println(array[i]);
        }
    }
}