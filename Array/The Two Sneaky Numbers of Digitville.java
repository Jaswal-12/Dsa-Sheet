//Approach-1
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
       
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         if(!mp.containsKey(nums[i])){
            mp.put(nums[i],1);
         }else{
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
         }
       }
       
       List<Integer>list=new ArrayList<>(mp.keySet());
       Collections.sort(list, (a, b) -> mp.get(b) - mp.get(a));

       int ans[]=new int[2];
       ans[0]=list.get(0);
       ans[1]=list.get(1);

       return ans;

    }
}
