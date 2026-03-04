// leetcode problem : https://leetcode.com/problems/split-array-largest-sum/description/

class seventeen {
     public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (can_split(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    public boolean can_split(int[] nums, int k, int max_sum) {
        int curr_sum = 0;
        int part_cnt = 1;

        for (int num : nums) {
            if (curr_sum + num > max_sum) {
                part_cnt++;
                curr_sum = num;

                if (part_cnt > k) {
                    return false;
                }
            } else {
                curr_sum += num;
            }
        }

        return part_cnt <= k;
    }
}
