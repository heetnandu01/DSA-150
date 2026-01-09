// leetcode Problem: https://leetcode.com/problems/circular-array-loop/description/

class nine {
       public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            boolean dir = nums[i] > 0;
            int slow = i, fast = i;
            while (true) {
                int nextSlow = next(nums, slow);
                int nextFast = next(nums, fast);
                int nextFast2 = next(nums, nextFast);
                if ((nums[nextSlow] > 0) != dir ||
                    (nums[nextFast] > 0) != dir ||
                    (nums[nextFast2] > 0) != dir)
                    break;
                slow = nextSlow;
                fast = nextFast2;
                if (slow == fast) {
                    if (slow == next(nums, slow)) break;
                    return true;
                }
            }
            int j = i;
            while (nums[j] != 0 && (nums[j] > 0) == dir) {
                int next = next(nums, j);
                nums[j] = 0;
                j = next;
            }
        }
        return false;
    }
    private int next(int[] nums, int i) {
        int n = nums.length;
        int next = (i + nums[i]) % n;
        if (next < 0) next += n;
        return next;
    } 
}
