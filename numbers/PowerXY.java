/**Given a positive integer n, find if it can be
 *  expressed as xy where y > 1 and x > 0. x and y both are integers. */
public class PowerXY{
    public static void main(String[] args) {
        int n = 48;
        System.out.println(existsXY(n));
    }

    static boolean existsXY(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
                int y = 2; 
  
                double p = Math.pow(i, y); 
      
                while (p <= n && p > 0) { 
                    if (p == n) 
                        return true; 
                    y++; 
                    p = Math.pow(i, y); 
                } 
        }
        return false;
    }
}