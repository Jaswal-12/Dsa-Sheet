class Solution {

    public static int helper(int arr[],int target,int idx){
        if(idx>arr.length-1) return -1;

        if(arr[idx]==target){
            return idx;
        }

        return helper(arr,target,idx+1);
    } 
    public int search(int[] nums, int target) {
       return  helper(nums,target,0);


    }
}
