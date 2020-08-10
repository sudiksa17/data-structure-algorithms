/**Given a number n. The problem is to check whether every bit
 *  in the binary representation of the given number is set or not. Here 0 <= n. */
public class SetBit{
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isSet(n));
    }

    static boolean isSet(int n){
        if (n==0){
            return false;
        } 
        while(n>0){
            if((n & 1)==0){
                return false;
            }
            n = n >> 1;
        }
        return true;

    }
}