// optimal-approach
class Solution {
    public long wonderfulSubstrings(String word) {
        
        long count = 0;
        int mask = 0;

        int[] freq = new int[1024]; // 2^10
        freq[0] = 1;

        for (char ch : word.toCharArray()) {

            int bit = ch - 'a';
            mask ^= (1 << bit); // toggle

            // same mask
            count += freq[mask];

            // one bit different
            for (int i = 0; i < 10; i++) {
                count += freq[mask ^ (1 << i)];
            }

            freq[mask]++;
        }

        return count;
    }
}
