class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int mn = nums[0];
        int mx = nums[nums.length - 1];
        
        int ans = 1;   // minimum gcd 1 hota hai
        
        for(int i = 1; i <= mn; i++){
            if(mn % i == 0 && mx % i == 0){
                ans = i;
            }
        }
        
        return ans;
    }
}
