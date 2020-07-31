/**Given an array of integers, find the nearest smaller number
 *  for every element such that the smaller element is on left side */
public class NearestSmallest{
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};

        int[] smallArr = smallLeftElement(arr);

        System.out.print("{");
        for(int i=0;i<smallArr.length;i++){
            System.out.print(smallArr[i]);
            if(i!=smallArr.length-1){
            System.out.print(", ");}
            
        }
        System.out.print(" }");
    }
    static int[] smallLeftElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            for(j = i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
            if (j == -1){
                res[i] = -1;
            }
        }

        return res;
    }
}