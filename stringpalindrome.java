public class stringpalindrome {
    public static void main(String[] args) {
        String str ="abcdcba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag= false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){System.err.println("palindrome");}
        else{ 
            System.err.println("not palindrome");
        }
    }
}
