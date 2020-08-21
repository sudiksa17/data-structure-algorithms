/**Find a Fixed Point (Value equal to index) in a given array */
public class FixedPoint{
    public static void main(String[] args) {
        int[] arr = {8,2,2,5,2};
        System.out.println(returnFixedPoint(arr));
    }

    static int returnFixedPoint(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                return i;
            }
        }
        return -1;
    }
}