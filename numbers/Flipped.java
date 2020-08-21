/**Given two numbers ‘a’ and b’. Write a program to count number
 *  of bits needed to be flipped to convert ‘a’ to ‘b’. */
public class Flipped{
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        System.out.println(count(a,b));
    }

    static int count(int a, int b){
        int n = a^b;

        int count = 0;
        while(n>0){
            count += n & 1; 
            n >>= 1;
        }
        return count;
    }
}