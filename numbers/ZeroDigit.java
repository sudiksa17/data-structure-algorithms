/**Given a number d, representing the number of digits
 *  of a positive integer. Find the total count of positive integer
 *  (consisting of d digits exactly) which have at-least one zero in them. */
public class ZeroDigit{
    public static void main(String[] args) {
        int d = 2;
        System.out.println(totalCount(d));
    }

    static int totalCount(int d){
        double total = 9.0*(Math.pow(10,d-1));
        double notzero = Math.pow(9,d);

        return (int)(total - notzero);
    }
}