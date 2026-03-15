class Solution {
    public int reverse(int x) {

       int n=x.length;
       int rem=0;
        while(n<0){
            int l=x%10;
            rem=+rem*10;
            x=x/10;
        }

        return rem;

    }
}
