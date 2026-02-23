class Solution {

    public boolean checkpal(String str, int s, int e) {

        if (s >= e) return true;

        if (str.charAt(s) != str.charAt(e))
            return false;

        return checkpal(str, s + 1, e - 1);
    }

    public boolean isPalindrome(String s) {

        // remove non-alphanumeric & convert lowercase
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return checkpal(s, 0, s.length() - 1);
    }
}
