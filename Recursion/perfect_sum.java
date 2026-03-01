class Solution {
    
    int subset(int arr[],int idx,int sum,int target ){

        if(idx == arr.length){
            return sum == target ? 1 : 0;
        }
        
        return subset(arr,idx+1,sum,target)
             + subset(arr,idx+1,sum-arr[idx],target);
    } 

    public int perfectSum(int[] nums, int target) {
        return subset(nums,0,0,target);
    }
}
