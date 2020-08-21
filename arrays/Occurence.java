/**Find first and last positions of an element in a sorted array */
public class Occurence{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125} ;
        int x = 5;
        int[] ans = findOccurence(arr,x);
        int first = ans[0];
        int last = ans[1];
        System.out.println(first);
        System.out.println(last);
    }

    static int[] findOccurence(int[] arr, int x){
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first = i;
                break;
            }
        }
        for(int i=first+1;i<arr.length;i++){
            if(arr[i]!=x){
                last = i-1;
                break;
            }
        }
        int[] ans = {first, last};
        return ans;
    }
}