// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void subsets(int arr[],int idx,int n,int sum){
        if(idx==n){
            System.out.println(sum);
            return;
        }
        
        // not pick//
        subsets(arr,idx+1,n,sum);
        subsets(arr,idx+1,n,sum+arr[idx]);
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3};
        int n=arr.length;
        int sum=0;
        subsets(arr,0,n,sum);
    }
}
