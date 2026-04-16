import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] vis = new int[arr.length]; // ✅ initialize

        helper(arr, ans, temp, vis);
        return ans;
    }

    public void helper(int[] arr, List<List<Integer>> ans, List<Integer> temp, int[] vis) {

        if (temp.size() == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (vis[i] == 0) {
                vis[i] = 1;
                temp.add(arr[i]);

                helper(arr, ans, temp, vis);

                vis[i] = 0; // backtrack
                temp.remove(temp.size() - 1); // ✅ correct remove
            }
        }
    }
}
