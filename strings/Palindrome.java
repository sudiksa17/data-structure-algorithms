public class Palindrome{
    public static void main(String[] args) {
        String s = "OP";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        s=s.replaceAll("[^a-zA-Z]", "").toLowerCase().trim();
        int n =s.length();
        char[] chArr = new char[n];
        for(int i=0;i<n;i++){
            chArr[i] = s.charAt(n-i-1);
        }
        String str = new String(chArr);
        System.out.println(str);
        if(s.equals(str)){
            return true;
        } else{
            return false;
        }
    }
}