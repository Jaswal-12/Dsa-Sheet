class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer>mp=new HashMap<>();


        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
        }

        
        int ele=0;
        int freq=0;
        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            if(e.getValue()>freq){
                freq=e.getValue();
                ele=e.getKey();
            }
        }

        return ele;




    }
}
