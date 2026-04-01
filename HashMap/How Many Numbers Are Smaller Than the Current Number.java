// brute-foce approach
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {


//          Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3] 
          int ans[]=new int[nums.length];
          int k=0;
          for(int i=0;i<nums.length;i++){
            int count=0;
           for(int j=0;j<nums.length;j++){
            if(i==j) continue;
            if(nums[i]>nums[j]){
                count++;
            }
           }
           ans[k]=count;
           k++;
          }

          return ans;
    }
}
