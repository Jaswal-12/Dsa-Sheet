class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int count = 0;       

        for(int i = left; i <= right; i++){   // ✅ correct range

            String x = words[i];

            int start = 0;
            int end = x.length() - 1;

            if( (x.charAt(start)=='a' || x.charAt(start)=='e' || x.charAt(start)=='i' 
                || x.charAt(start)=='o' || x.charAt(start)=='u') 
                
                && 
                
                (x.charAt(end)=='a' || x.charAt(end)=='e' || x.charAt(end)=='i' 
                || x.charAt(end)=='o' || x.charAt(end)=='u') ){
                
                count++;
            }
        }

        return count;
    }
}
