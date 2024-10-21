import java.util.Arrays;

public class Array {
    
    // Method to reassign values to a new array
    public static String[] createNewArray(String[] originalArray) {
        // Create a new array with the same length as the original array
        String[] newArray = new String[originalArray.length];
        
        // Copy values from the original array to the new array with changes (e.g., append " - modified")
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i] + " - modified";
        }
        
        return newArray; // Return the new array
    }

    public static void main(String[] args) {
        // Create the original array
        String[] originalArray = {"Book 1", "Book 2", "Book 3"};
        
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        
        // Call the method to create a new array
        String[] newArray = createNewArray(originalArray);
        
        // Print the new array
        System.out.println("New Array: " + Arrays.toString(newArray));
        
        // Verify that the original array has not changed
        System.out.println("Original Array after method call: " + Arrays.toString(originalArray));
    }
}