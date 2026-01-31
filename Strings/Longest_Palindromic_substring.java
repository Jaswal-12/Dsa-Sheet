class Solution {
    public boolean ispal(String x){
        int left=0;
        int right=x.length()-1;

        while(left<right){
            if(x.charAt(left)!=x.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String x=s.substring(i,j+1);
                if(ispal(x) && x.length()>ans.length()){
                    ans=x;
                }
            }
        }

        return ans;
    }
}
