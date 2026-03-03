import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {

        Arrays.sort(arr);   // important step

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(arr, 0, target, ans, temp);
        return ans;
    }

    public void helper(int arr[], int idx, int target,
                       List<List<Integer>> ans,
                       List<Integer> temp) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            // skip duplicates
            if (i > idx && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break;

            temp.add(arr[i]);

            helper(arr, i + 1, target - arr[i], ans, temp);

            temp.remove(temp.size() - 1);
        }
    }
}
