import java.util.*;

public class ArrayRotation{
    public static void main(String[] args){

    //array to be rotated
     int[] arr = {1,2,3,4,5};

     //rotation by k units
     int k = 2;

     int[] ans = rotation(arr, arr.length, k);
     for(int i=0;i<arr.length;i++){
         System.out.println(ans[i]);
     }
    }

    //rotation of int array arr by k units
    static int[] rotation(int[] arr, int n, int k){
        int[] rotated = new int[n];
        for(int i=0;i<n;i++){
           if(i+k<n){
            rotated[i+k] = arr[i];
           }else {
            rotated[(i+k)-n] = arr[i];
        }
        }
        return rotated;
    }
}