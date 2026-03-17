class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }

        return false;
    }
}

//optimal_approach

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(i - mp.get(nums[i]) <= k){
                    return true;
                }
            }
            mp.put(nums[i], i); // ✅ important
        }

        return false;
    }
}
