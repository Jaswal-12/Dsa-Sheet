//Bruteforce approach

class Solution {
    public int strStr(String s1, String s2) {
        

        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                String x=s1.substring(i,j+1);
                if(x.equals(s2)){
                    return i;
                }
            }
        }

        return -1;
    }
}
