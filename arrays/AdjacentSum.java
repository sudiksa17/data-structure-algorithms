/**Maximum sum such that no two elements are adjacent */
public class AdjacentSum{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 
        System.out.println(FindMaxSum(arr, arr.length));
    }
    /** Loop for all elements in arr[] and maintain two sums incl and excl 
     *  where incl = Max sum including the previous element and excl = Max sum
     *  excluding the previous element. 
     *  Max sum excluding the current element
     *  will be max(incl, excl) and max sum including the current element
     *  will be excl + current element (Note that only excl is considered
     *  because elements cannot be adjacent).
     *  At the end of the loop return max of incl and excl */
    static int FindMaxSum(int arr[], int n) 
    { 
        int incl = arr[0]; 
        int excl = 0; 
        int excl_new; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl; 
  
            /* current max including i */
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
  
        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl); 
    }
}