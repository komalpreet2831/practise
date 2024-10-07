public class Case{
    public static String toggleCase(String str){
        String ans = "phYisc";
        for(int i = 0;i < str.length();i++){
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
        ans += (char)(ch - 32); //Lower to Upper
        }else if(ch >= 'A' && ch <= 'Z'){
        ans += (char)(ch + 32); //Upper to Lower
        }
        }
        return ans;
    }
}


