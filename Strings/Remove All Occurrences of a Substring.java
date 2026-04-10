class Solution {
    public String removeOccurrences(String s, String part) {
        
        StringBuilder sb = new StringBuilder(s);

        while (true) {
            boolean found = false;

            int p1 = 0;
            int p2 = part.length() - 1;

            while (p2 < sb.length()) {
                String x = sb.substring(p1, p2 + 1);

                if (x.equals(part)) {
                    sb.delete(p1, p2 + 1); // remove substring
                    found = true;
                    break; // restart scanning
                }

                p1++;
                p2++;
            }

            if (!found) break;
        }

        return sb.toString();
    }
}
