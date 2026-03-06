class Solution {
    public boolean checkOnesSegment(String s) {

        boolean flag = false;

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                flag = true;
                break;
            }
        }

        if(flag == true){
            return false;
        }else{
            return true;
        }
    }
}
