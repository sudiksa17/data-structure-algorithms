class Largest{
    public static void main(String[] args) {
        int[] arr = {8,89};
        System.out.println(largestNumber(arr));
    }
    static String largestNumber(final int[] A) {
        int n = A.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(!XgreaterY(A[i],A[j])){
                    int temp =  A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        String ans="";
        for(int i=0;i<n;i++){
            ans += Integer.toString(A[i]);
        }
        return ans;
    }
    static boolean XgreaterY(int x, int y){
        String stringa = Integer.toString(x)+Integer.toString(y);
        int a = Integer.valueOf(stringa);
        String stringb = Integer.toString(y)+Integer.toString(x);
        int b = Integer.valueOf(stringb);
       // System.out.println(a);
        //System.out.println(b);
        if(a>=b){
            return true;
        } else {
            return false; 
        }
    }
}