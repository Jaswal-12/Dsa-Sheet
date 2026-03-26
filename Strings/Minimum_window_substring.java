//brute force

import java.util.*;

class Solution {

    public boolean isValid(String x, String t){
        int[] freq = new int[128];

        // count t
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        // subtract from x
        for(char c : x.toCharArray()){
            freq[c]--;
        }

        // check if all satisfied
        for(int i = 0; i < 128; i++){
            if(freq[i] > 0){
                return false;
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){

                String x = s.substring(i, j + 1);

                if(isValid(x, t) && x.length() < minLen){
                    ans = x;
                    minLen = x.length();
                }
            }
        }

        return ans;
    }
}
