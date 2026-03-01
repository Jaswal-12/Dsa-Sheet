class Main {

    public static boolean find(int arr[], int idx, int n,
                               int target, int sum) {

        // target mil gaya
        if (sum == target)
            return true;

        // array khatam
        if (idx == n)
            return false;

        // optimization
        if (sum > target)
            return false;

        // NOT PICK
        boolean notPick = find(arr, idx + 1, n, target, sum);

        // PICK
        boolean pick = find(arr, idx + 1, n, target,
                            sum + arr[idx]);

        return pick || notPick;
    }

    public static void main(String[] args) {

        int arr[] = {3, 6, 4, 5};
        int target = 35;

        System.out.println(find(arr, 0, arr.length, target, 0));
    }
}



//Second-Method

class Main {
    
    public static boolean helper(int arr[],int idx,int n,int target,int sum){
        
        if(target==0){
            return true;
        }
        
        if(idx==n || target<0){
            return false;
        }
        
        return helper(arr,idx+1,n,target,sum) ||
               helper(arr,idx+1,n,target-arr[idx],sum);
    }

    public static void main(String[] args) {
        
        int arr[]={3,6,4,5};
        int target=12;
        int n=arr.length;
        int sum=0;

        System.out.println(helper(arr,0,n,target,sum));
    }
}
