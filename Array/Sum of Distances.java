// Brute force

class Solution {
    public long[] distance(int[] arr) {
        
        long ans[]=new long[arr.length];
        int k=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]  && j!=i){
                    sum=sum+Math.abs();
                }
            }

            ans[k]=sum;
            k++;
        }

        return ans;
    }
}
