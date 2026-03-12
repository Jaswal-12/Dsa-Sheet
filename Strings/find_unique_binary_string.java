import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        List<String> ans = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        
        int n = nums[0].length();
        
        help(nums, 0, ans, temp, n);
        
        for(String s : ans){
            boolean found = false;
            for(String num : nums){
                if(num.equals(s)){
                    found = true;
                    break;
                }
            }
            if(!found) return s;
        }
        
        return "";
    }

    public static void help(String nums[], int idx, List<String> ans, List<Character> temp, int n){
        
        if(temp.size() == n){
            String s = "";
            for(char c : temp){
                s += c;
            }
            ans.add(s);
            return;
        }

        temp.add('0');
        help(nums, idx+1, ans, temp, n);
        temp.remove(temp.size()-1);

        temp.add('1');
        help(nums, idx+1, ans, temp, n);
        temp.remove(temp.size()-1);
    }
}
