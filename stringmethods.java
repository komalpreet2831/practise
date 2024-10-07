 //SECOND LARGEST  && SECOND SMALLEST // 

/*public class Solution{
    static int secondLargest(int n, int a[]) {
        int largest = a[0];
        int slargest = Integer.MIN_VALUE; // Initialize slargest
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    static int secondSmallest(int n, int a[]) {
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE; // Initialize ssmallest
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargest = secondLargest(n, a);
        int ssmallest = secondSmallest(n, a);
        return new int[]{slargest, ssmallest}; // Correct way to return an array in Java
    }
} */


//           Check if array is sorted or not             //
/*public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return 0;
            }

        }
        return 1;
    }
}*/

//  Remove Duplicates from Sorted Array //
/* public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[j]!=arr[i]){
                arr[++j] = arr[i];
            }
        }
        return j+1;
    }
}*/
//          DECIMAL TO BINARY //
/*class Solution {
    void toBinary(int N) {
        int binaryNum[] = new int[20];
        int i=0;
        while(N>0){
            binaryNum[i] = N%2;
            N = N/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
           System.out.print(binaryNum[j]);
        }
    }
}*/

//     ARMSTRONG NUMBER //
/*class Solution {
    static String armstrongNumber(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp = temp/10;
        }
        if(sum==n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}   */

//   TOOGLE Character in String //
/*   public static void main(String args[]){
        System.out.println("Enter string to toggle: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            boolean flag = true;   // capital
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int asci = (int)ch;  //typecasting
            if(asci>=97){
                flag = false;       // small
            }
            if(flag == true){
                asci +=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.print(str);




    }
    
}      */

//    Paindrome Strings   //
/*public static void main(String args[]){
    System.out.println("Enter string  : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean flag = true;
    int i=0;
    int j = str.length()-1;
    while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            flag = false;
            break;
        }
        i++;
        j--;
    }
    if(flag==true){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
*/
    
// count of palindromic substrings //
/import java.util.;
public class stringmethods {
    public static boolean isPalindrome(String str){
        boolean flag = true;
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
    }
            i++;
            j--;
}
        return true;
}
    public static void main(String args[]){
        System.out.println("Enter string  : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }

                }
            }
            System.out.println("\nThe number of palindromic substrings are: "+count);

        }
    }
    */


    //  Reverse each word in a sentence //
    /*public static void main(String args[]){
        System.out.println("Enter string  : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans +=sb;
                ans+=" ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.print(ans);
    }*/
     //   String Compression  //
      
     /*public class Solution{
        public static void main(String args[]){
        String str = "aabbbcccddeeee";
        String ans = ""+str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                
                ans += count;
                
                count =1;
                ans += curr;
            }
        }
        
        ans += count;
        System.out.println(ans);

    }
}*/

//    CHECK IF TWO STRINGS ARE ANAGRAM   // 
/import java.util.;

public class Solution {
    
    public static void main(String args[]) {
        String s1 = "LISTEN";
        String s2 = "FRD";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        if(c1.length != c2.length) {
            System.out.println("Not Anagram");
        } else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean isAnagram = true;
            for(int i = 0; i < c1.length; i++) {
                if(c1[i] != c2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
*/

//   Price of roses for Deepak's girlfriend  //
/import java.util.;
public class array1 {
    public static void roses(int arr[],int target){
        Arrays.sort(arr);
        int fl = 0;
        int fr = 0;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                fl = left;
                fr = right;
                left++;
                right--;
            }
        }
        System.out.println("Roses choosen by Deepak are "+arr[fl]+" and "+arr[fr]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter price of roses: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter money with Deepak : ");
        int target = sc.nextInt();

        array1 obj = new array1();

        obj.roses(arr,target);
    }
}*/

//  Vowel substring  //

/import java.util.;
public class vowel {
    // Longest consecutive vowel substring // 
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter string: ");     
       String str = sc.nextLine();     // cbaeicde 
       int count =0;
       int ans =0;
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(isVowel(ch)){
            count++;
        }
        else{
            ans = Math.max(ans,count);
            count=0;
        }

       }
       System.out.println(Math.max(ans,count));
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    
}
*/
//        NEXT  PERMUTATION // 
/import java.util.;
public class array1 {
    //    Next Permutation  //
    // 1) find the decreasing element from right to left //
    // 2) then take j from last find next greater number than arr[i] //
    // 3) swap them 
    // 4) reverse the arr from where decreasing is found //
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[7];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        array1 obj = new array1();
        obj.nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public void nextPermutation(int[] arr){
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
           int j= arr.length-1;
           while(arr[i]>=arr[j]){
            j--;
           }
           swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int i,int j){
        while (i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
*/
//              Reverse  A String           //
/*StringBuilder sb = new StringBuilder("The sky is blue");
String s = sb.reverse().toString();
System.out.print(s);
*/

// Square of Sorted Array //
/*
 public static void main(String args[]) {
    int n =5;
    int nums[] = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();

    }
    for(int i=0;i<n;i++){
        nums[i] = nums[i]*nums[i];
    }
    Arrays.sort(nums);
    for(int i=0;i<n;i++){
    System.out.print(nums[i]+" ");
    }
 */
//   Next Greater Element     //
/*
 
 *///SECOND LARGEST  && SECOND SMALLEST // 

/*public class Solution{
    static int secondLargest(int n, int a[]) {
        int largest = a[0];
        int slargest = Integer.MIN_VALUE; // Initialize slargest
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    static int secondSmallest(int n, int a[]) {
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE; // Initialize ssmallest
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargest = secondLargest(n, a);
        int ssmallest = secondSmallest(n, a);
        return new int[]{slargest, ssmallest}; // Correct way to return an array in Java
    }
} */


//           Check if array is sorted or not             //
/*public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return 0;
            }

        }
        return 1;
    }
}*/

//  Remove Duplicates from Sorted Array //
/* public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[j]!=arr[i]){
                arr[++j] = arr[i];
            }
        }
        return j+1;
    }
}*/
//          DECIMAL TO BINARY //
/*class Solution {
    void toBinary(int N) {
        int binaryNum[] = new int[20];
        int i=0;
        while(N>0){
            binaryNum[i] = N%2;
            N = N/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
           System.out.print(binaryNum[j]);
        }
    }
}*/

//     ARMSTRONG NUMBER //
/*class Solution {
    static String armstrongNumber(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum + (rem*rem*rem);
            temp = temp/10;
        }
        if(sum==n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}   */

//   TOOGLE Character in String //
/*   public static void main(String args[]){
        System.out.println("Enter string to toggle: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            boolean flag = true;   // capital
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int asci = (int)ch;  //typecasting
            if(asci>=97){
                flag = false;       // small
            }
            if(flag == true){
                asci +=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.print(str);




    }
    
}      */

//    Paindrome Strings   //
/*public static void main(String args[]){
    System.out.println("Enter string  : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean flag = true;
    int i=0;
    int j = str.length()-1;
    while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            flag = false;
            break;
        }
        i++;
        j--;
    }
    if(flag==true){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
*/
    
// count of palindromic substrings //
/import java.util.;
public class stringmethods {
    public static boolean isPalindrome(String str){
        boolean flag = true;
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
    }
            i++;
            j--;
}
        return true;
}
    public static void main(String args[]){
        System.out.println("Enter string  : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }

                }
            }
            System.out.println("\nThe number of palindromic substrings are: "+count);

        }
    }
    */


    //  Reverse each word in a sentence //
    /*public static void main(String args[]){
        System.out.println("Enter string  : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans +=sb;
                ans+=" ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.print(ans);
    }*/
     //   String Compression  //
      
     /*public class Solution{
        public static void main(String args[]){
        String str = "aabbbcccddeeee";
        String ans = ""+str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                
                ans += count;
                
                count =1;
                ans += curr;
            }
        }
        
        ans += count;
        System.out.println(ans);

    }
}*/

//    CHECK IF TWO STRINGS ARE ANAGRAM   // 
/import java.util.;

public class Solution {
    
    public static void main(String args[]) {
        String s1 = "LISTEN";
        String s2 = "FRD";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        if(c1.length != c2.length) {
            System.out.println("Not Anagram");
        } else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean isAnagram = true;
            for(int i = 0; i < c1.length; i++) {
                if(c1[i] != c2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
*/

//   Price of roses for Deepak's girlfriend  //
/import java.util.;
public class array1 {
    public static void roses(int arr[],int target){
        Arrays.sort(arr);
        int fl = 0;
        int fr = 0;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                fl = left;
                fr = right;
                left++;
                right--;
            }
        }
        System.out.println("Roses choosen by Deepak are "+arr[fl]+" and "+arr[fr]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter price of roses: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter money with Deepak : ");
        int target = sc.nextInt();

        array1 obj = new array1();

        obj.roses(arr,target);
    }
}*/

//  Vowel substring  //

/import java.util.;
public class vowel {
    // Longest consecutive vowel substring // 
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter string: ");     
       String str = sc.nextLine();     // cbaeicde 
       int count =0;
       int ans =0;
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(isVowel(ch)){
            count++;
        }
        else{
            ans = Math.max(ans,count);
            count=0;
        }

       }
       System.out.println(Math.max(ans,count));
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    
}
*/
//        NEXT  PERMUTATION // 
/import java.util.;
public class array1 {
    //    Next Permutation  //
    // 1) find the decreasing element from right to left //
    // 2) then take j from last find next greater number than arr[i] //
    // 3) swap them 
    // 4) reverse the arr from where decreasing is found //
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[7];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        array1 obj = new array1();
        obj.nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public void nextPermutation(int[] arr){
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
           int j= arr.length-1;
           while(arr[i]>=arr[j]){
            j--;
           }
           swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int i,int j){
        while (i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
*/
//              Reverse  A String           //
/*StringBuilder sb = new StringBuilder("The sky is blue");
String s = sb.reverse().toString();
System.out.print(s);
*/

// Square of Sorted Array //
/*
 public static void main(String args[]) {
    int n =5;
    int nums[] = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();

    }
    for(int i=0;i<n;i++){
        nums[i] = nums[i]*nums[i];
    }
    Arrays.sort(nums);
    for(int i=0;i<n;i++){
    System.out.print(nums[i]+" ");
    }
 */
