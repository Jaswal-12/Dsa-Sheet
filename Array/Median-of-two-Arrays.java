class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
         int n = nums1.length;
         int m = nums2.length;
         int ans[] = new int[n + m];
          
         int k = 0;
         for(int i = 0; i < n; i++){
            ans[k] = nums1[i];
            k++;
         }

         for(int i = 0; i < m; i++){
            ans[k] = nums2[i];
            k++;
         }

         Arrays.sort(ans);

         int len = ans.length;

         if(len % 2 == 0) {
             return (ans[len/2 - 1] + ans[len/2]) / 2.0;
         } else {
             return ans[len/2];
         }
    }
}
