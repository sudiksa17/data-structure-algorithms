/**Given an integer x, find it’s square root.
 *  If x is not a perfect square, then return floor(√x). */
public class SquareRoot{
    public static void main(String[] args) {
        int n = 80;
        System.out.println(squareRoot(n));
    }

    static int squareRoot(int n){
        int i=0;
        int result = 0;
        while(result<=n){
            i++;
            result = i*i;
        }
        return i-1;
    }
}