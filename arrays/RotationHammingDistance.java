//Find  rotation with maximum hamming distance
//Given an array of n elements, create a new array which is a rotation of
//given array and hamming distance between both the arrays is maximum.
//Hamming distance between two arrays or strings of equal length is the number 
//of positions at which the corresponding character(elements) are different.
public class RotationHammingDistance{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(maxHamming(arr,n));
    }
    static int maxHamming(int arr[], int n) 
    { 
        // arr[] to brr[] two times so that 
        // we can traverse through all rotations. 
        int brr[]=new int[2 *n + 1]; 
        for (int i = 0; i < n; i++) 
            brr[i] = arr[i]; 
        for (int i = 0; i < n; i++)  
            brr[n+i] = arr[i]; 
      
        // We know hamming distance with  
        // 0 rotation would be 0. 
        int maxHam = 0;  
      
        // We try other rotations one by one  
        // and compute Hamming distance 
        // of every rotation 
        for (int i = 1; i < n; i++) 
        { 
            int currHam = 0; 
            for (int j = i, k=0; j < (i + n); j++, 
                                              k++)  
                if (brr[j] != arr[k]) 
                    currHam++; 
      
            // We can never get more than n.  
            if (currHam == n) 
                return n; 
      
            maxHam = Math.max(maxHam, currHam); 
        } 
      
        return maxHam; 
    }  
}