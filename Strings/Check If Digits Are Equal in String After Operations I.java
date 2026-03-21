class Solution {
    public boolean hasSameDigits(String s) {
        

        while(s.length()>2){
            String x="";
            for(int i=0;i<s.length()-1;i++){
                int a=s.charAt(i)-'0';
                int b=s.charAt(i+1)-'0';
                int c=(a+b)%10;
                x=x+c;
            }

            s=x;
        }

        return s.charAt(0)==s.charAt(1);
    }
}
