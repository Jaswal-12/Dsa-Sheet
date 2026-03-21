class Solution {
    public int totalMoney(int n) {
        
        int total = 0;
        int start = 1;   // Monday value
        int day = 0;     // track day in week (0 to 6)

        for (int i = 1; i <= n; i++) {
            
            total += start + day;  // current day money
            
            day++;

            // week complete (Sunday ke baad)
            if (day == 7) {
                day = 0;
                start++;  // next Monday +1
            }
        }

        return total;
    }
}
