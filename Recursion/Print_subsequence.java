
class Solution {

    public void helper(int arr[], int idx, int n,
                       List<List<Integer>> ans,
                       List<Integer> temp) {

        // base case
        if (idx == n) {
            ans.add(new ArrayList<>(temp)); // ✅ copy list
            return;
        }

        // NOT TAKE
        helper(arr, idx + 1, n, ans, temp);

        // TAKE
        temp.add(arr[idx]);
        helper(arr, idx + 1, n, ans, temp);

        // ✅ BACKTRACK
        temp.remove(temp.size() - 1);
    }

    public List<List<Integer>> subsets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(arr, 0, arr.length, ans, temp);
        return ans;
    }
}
