//leetcode
//brute force
class Solution {
    public int countPairs(int[] arr) {
        
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                
                int sum = arr[i] + arr[j];

                // check power of 2
                if(sum > 0 && (sum & (sum - 1)) == 0){
                    count++;
                }
            }
        }

        return count;
    }
}
