// #leetcode-56
class Solution {
    public int[][] merge(int[][] arr) {
        
        if(arr.length <= 1){
            return arr;
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(arr[0]);

        for(int i = 1; i < arr.length; i++){

            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];

            // FIXED CONDITION
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }else{
                res.add(curr);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
