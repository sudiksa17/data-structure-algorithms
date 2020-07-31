//Given a sorted array, find if there is a pair with a given sum

public class CheckGivenSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 5;

        System.out.println(pairExists(arr, sum));
    }

    static boolean pairExists(int[] arr, int sum) {
 
        int n = arr.length;
        int pivotForRotation = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                pivotForRotation = i ;
                break;
            }
        }
        int lowestindex = (pivotForRotation+1)%n;
        int largestindex = pivotForRotation;
        
        while (lowestindex!= largestindex){
            if(arr[lowestindex]+arr[largestindex]==sum)
                return true;
                
            //If current pair sum is less, move to the higher sum 
            if (arr[lowestindex] + arr[largestindex] < sum) 
            lowestindex = (lowestindex + 1) % n; 
              
            else  // Move to the lower sum side 
            largestindex = (n + largestindex - 1) % n;
            
        }
        return false;
        
    }
}