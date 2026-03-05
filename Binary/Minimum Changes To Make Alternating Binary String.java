// leetcode 1758
class Solution {
    public int minOperations(String s) {

        int c1 = 0;
        int c2 = 0;

        for(int i = 0; i < s.length(); i++){

            // pattern 010101
            if(s.charAt(i) != (i % 2 == 0 ? '0' : '1')){
                c1++;
            }

            // pattern 101010
            if(s.charAt(i) != (i % 2 == 0 ? '1' : '0')){
                c2++;
            }
        }

        return Math.min(c1, c2);
    }
}
