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

//sliding window approach and optimal
class Solution {
    public int strStr(String s1, String s2) {
        int p1 = 0;
        int p2 = s2.length() - 1;
        while (p2 < s1.length()) {
            String x = "";
            for (int i = p1; i <= p2; i++) {
                x = x + s1.charAt(i);
            }
            if (x.equals(s2)) {
                return p1;
            }
            p1++;
            p2++;
        }
        return -1;
    }
}
