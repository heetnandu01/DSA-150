// leetcode Problem : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Fifteen {
     public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentLoad = 0;
            int dayCount = 1;
            for (int w : weights) {
                if (currentLoad + w <= mid) {
                    currentLoad += w;
                } else {
                    dayCount++;
                    currentLoad = w;
                }
            }
            if (dayCount <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
