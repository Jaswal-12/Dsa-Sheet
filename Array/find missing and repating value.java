class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        
        ArrayList<Integer> l = new ArrayList<>();

        // flatten matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                l.add(arr[i][j]);
            }
        }

        // sort
        Collections.sort(l);

        int ans[] = new int[2];
        int k = 0;

        // find repeated
        for(int i = 0; i < l.size() - 1; i++){
            if(l.get(i).equals(l.get(i+1))){
                ans[k++] = l.get(i);
                break;
            }
        }

        // use set
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < l.size(); i++){
            hs.add(l.get(i));
        }

        int n = arr.length;

        // total sum from 1 to n*n
        int fullsum = (n * n * (n * n + 1)) / 2;

        int sum = 0;
        for(int val : hs){
            sum += val;
        }

        // missing number
        ans[k] = fullsum - sum;

        return ans;
    }
}
