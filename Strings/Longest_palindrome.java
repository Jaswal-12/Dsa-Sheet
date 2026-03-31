class Solution {
    public int longestPalindrome(String s) {
        
        int sum = 0;
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), 1);
            }else{
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        boolean oddFound = false; // add

        for(Map.Entry<Character,Integer> e : mp.entrySet()){
            if(e.getValue() % 2 == 0){
                sum = sum + e.getValue();
            } else {
                sum = sum + (e.getValue() - 1); // add
                oddFound = true;               // add
            }
        }

        if(oddFound) return sum + 1; // fix
        return sum;                 // fix
    }
}
