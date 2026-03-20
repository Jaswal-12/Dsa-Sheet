class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       HashMap<Integer,Integer>mp=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        if(!mp.containsKey(nums[i])){
            mp.put(nums[i],1);
        }else{
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       } 

       List<Integer>l=new ArrayList<>(mp.keySet());
       Collections.sort(l,(a,b)->mp.get(b)-mp.get(a));

       int ans[]=new int[k];
       for(int i=0;i<k;i++){
        ans[i]=l.get(i);
       }

       return ans;


       
    }
}
