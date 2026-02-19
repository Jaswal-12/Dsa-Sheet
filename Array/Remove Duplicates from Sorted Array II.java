import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] arr) {
        
        int n = arr.length;
        if(n == 0) return 0;

        Arrays.sort(arr);

        int[] new_arr = new int[n];
        
        int k = 0;
        int count = 1;   // first element already counted
        
        new_arr[k] = arr[0];
        k++;

        for(int i = 1; i < n; i++) {
            
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 1;  // new element start
            }
            
            if(count <= 2) {
                new_arr[k] = arr[i];
                k++;
            }
        }

        // copy back to original array
        for(int i = 0; i < k; i++) {
            arr[i] = new_arr[i];
        }

        return k;
    }
}
