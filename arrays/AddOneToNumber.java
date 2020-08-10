import java.util.ArrayList;

class AddOneToNumber{
    public static void main(String[] args) {
    //     int[] arr = {1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5};
    //    int[] res = plusOne(arr);
    ArrayList<Integer> aList = new ArrayList<Integer>();
      aList.add(473);
      aList.add(278);
      aList.add(873);
      aList.add(323);
      aList.add(378);
        // for(int i=0;i<res.length;i++){
        //     System.out.println(res[i]);
        // }
        System.out.println(firstMissingPositive(aList));
        
    }
    static int[] plusOne(int[] A) {
        long num = 0;
        int n = A.length;
        int j = A.length-1;
        for(int i  = 0;i<n;i++){
            num += Math.pow(10,j)*A[i];
            j--;
        }
        num ++;
        String temp = Long.toString(num);
        
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        System.out.println(temp);
        return newGuess;
    }

     static int firstMissingPositive(ArrayList<Integer> A) {
        int  ans = 0;
        for(int i=1;i<=A.size();i++){
            System.out.println(i);
            if(!A.contains(i)){
                ans = i;
            }
        }
        return ans;
    }

}