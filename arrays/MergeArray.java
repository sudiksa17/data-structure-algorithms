class MergeArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums = new int[nums1.length];
        
            while(i<m&&j<n){
               if(nums1[i]<=nums2[j]){
                nums[k] = nums1[i];
                i++;
                   k++;
            } else if(nums1[i]>nums2[j]){
                nums[k] = nums2[j];
                j++;
                   k++;
            } 
            }
        
        while(i<m){
            nums[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<n){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        for(int q = 0;q<nums1.length;q++){
            nums1[q] = nums[q];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2,3);
        for(int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}