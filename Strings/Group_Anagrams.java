import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] s) {

        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[s.length];

        for (int i = 0; i < s.length; i++) {

            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(s[i]);
            visited[i] = true;

            for (int j = i + 1; j < s.length; j++) {

                if (visited[j]) continue;

                if (isAnagram(s[i], s[j])) {
                    group.add(s[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }
        return ans;
    }

    // EASY anagram check (sorting)
    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
}
