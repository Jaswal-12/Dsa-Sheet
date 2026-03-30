class Solution {
    public boolean canBeEqual(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        char[] arr = s1.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == s2.charAt(i)) continue;

            boolean found = false;

            for (int j = i + 2; j < n; j++) {

                if ((j - i) % 2 == 0 && arr[j] == s2.charAt(i)) {

                    // swap
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }
}
