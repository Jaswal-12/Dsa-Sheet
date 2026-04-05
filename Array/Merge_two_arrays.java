//brute force

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int ans[]=new int[n+m];
        int k=0;

        for(int i=0;i<m;i++){
            if(nums1[i]==0){
                continue;
            }
            ans[k++]=nums1[i];
            // k++;
        }

        for(int i=0;i<n;i++){
              if(nums2[i]==0){
                continue;
            }
            ans[k++]=nums2[i];
            // k++;
        }

        Arrays.sort(ans);
        for(int i=0;i<m+n;i++){
            nums1[i]=ans[i];
        }




    }
}
