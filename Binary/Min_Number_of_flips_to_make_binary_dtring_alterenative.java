class Solution {
    public int minFlips(String s) {

        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int r = 0; r < n; r++){

            String rotated = s.substring(r) + s.substring(0, r);

            int flip1 = 0;
            int flip2 = 0;

            for(int i = 0; i < n; i++){

                char c = rotated.charAt(i);

                // pattern 010101
                if(c != (i % 2 == 0 ? '0' : '1')){
                    flip1++;
                }

                // pattern 101010
                if(c != (i % 2 == 0 ? '1' : '0')){
                    flip2++;
                }
            }

            ans = Math.min(ans, Math.min(flip1, flip2));
        }

        return ans;
    }
}
