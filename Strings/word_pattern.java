class Solution {
    public boolean wordPattern(String s1, String s2) {
        
        String[] words = s2.split(" ");
        if (s1.length() != words.length) {
            return false;
        }

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            String word = words[i];

            // compare pattern (same logic like frequency but better)
            if (mp1.getOrDefault(ch, -1) != mp2.getOrDefault(word, -1)) {
                return false;
            }

            // store index (instead of frequency)
            mp1.put(ch, i);
            mp2.put(word, i);
        }

        return true;
    }
}
