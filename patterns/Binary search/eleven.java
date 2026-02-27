// leetcode Problem : https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

class eleven {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < m * k) return -1;
        int max = 0;
        for (int i : bloomDay) {
            max = Math.max(max, i);
        }
        int l = 1, r = max;
        int minDays = -1;
        while (l <= r) {
            int curr = (l + r) / 2;
            int consecutive = 0;
            int bouquets = 0;
            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= curr) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }
            if (bouquets >= m) {
                minDays = curr;
                r = curr - 1;
            } else {
                l = curr + 1;
            }
        }
        return minDays;
    }
}
