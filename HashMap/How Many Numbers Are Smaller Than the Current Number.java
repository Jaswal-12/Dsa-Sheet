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


//brute force
import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // Step 1: frequency map
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: sort unique elements
        ArrayList<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list);

        // Step 3: prefix sum (count of smaller numbers)
        int sum = 0;
        HashMap<Integer, Integer> smaller = new HashMap<>();

        for(int num : list){
            smaller.put(num, sum);
            sum += mp.get(num);
        }

        // Step 4: build result
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = smaller.get(nums[i]);
        }

        return ans;
    }
}
