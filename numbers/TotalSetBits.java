
/**Given a positive integer n, count the total number of set bits
 *  in binary representation of all numbers from 1 to n. */
public class TotalSetBits{
    public static void main(String[] args) {
        int n = 6;
        System.out.println(countSetBits(n));
    }

    static int countSetBits(int n){
        int res = 0;
        for(int i=1;i<=n;i++){
           res += count(i);
        }
        return res;
    }

    static int count(int n){
        int count = 0;
        while(n>0){
            count += n & 1; 
            n >>= 1;
        }
        return count;
    }
}