class Solution {

    String max = "";

    public void solve(String[] arr, int idx){

        if(idx == arr.length){
            String curr = "";
            for(String s : arr)
                curr += s;

            if(max.compareTo(curr) < 0)
                max = curr;

            return;
        }

        for(int i=idx;i<arr.length;i++){

            swap(arr,i,idx);
            solve(arr,idx+1);
            swap(arr,i,idx);
        }
    }

    void swap(String[] arr,int i,int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public String largestNumber(int[] nums){

        String[] arr=new String[nums.length];

        for(int i=0;i<nums.length;i++)
            arr[i]=String.valueOf(nums[i]);

        solve(arr,0);

        if(max.charAt(0)=='0') return "0";

        return max;
    }
}
