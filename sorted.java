import java.util.*;

public class sorted {
    
    public static void main(String args[]) {
       
       Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.println("Enter elements: ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println("Sorted elements: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}