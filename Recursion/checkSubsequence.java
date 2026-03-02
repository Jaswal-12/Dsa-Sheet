//brute-force
// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int n, int[] arr, int target) {
        
        int idx=0;
        return helper(n,idx,arr,target);
               
    }
    
    public static boolean helper(int n,int idx,int arr[],int target){
        
        
         if(target==0){
            return true;
        }
        
        if(idx==n){
            return false;
        }
        
        
        
    return helper(n,idx+1,arr,target) || helper(n,idx+1,arr,target-arr[idx]);
        
    }
}
