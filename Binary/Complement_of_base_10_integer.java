class Solution {
    public int bitwiseComplement(int n) {
        

        String x=Integer.toBinaryString(n);
        
        String ans="";
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='0'){
                ans=ans+'1';
            }else{
                ans=ans+'0';
            }
        }

        return Integer.parseInt(ans,2);
    }
}
