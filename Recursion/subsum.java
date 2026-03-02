class Main {
    
    public static int subsum(int arr[],int idx,int n,int sum){
        if(sum==0){
            return 1;
        }
        
        if(idx==n || sum<0){
            return 0;
        }
        
        return subsum(arr,idx+1,n,sum) +subsum(arr,idx,n,sum-arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        int sum=6;
        System.out.println(subsum(arr,0,3,sum));
    }
}
