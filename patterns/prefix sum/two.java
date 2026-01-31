// leetcode Problem : https://leetcode.com/problems/find-pivot-index/description/

class two {
      public int pivotIndex(int[] nums) {
        int n = nums.length;
        int [] sumsleft = new int [n];
        int [] sumsright = new int [n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            sumsleft[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for(int i = n-1;i>=0;i--){
            sumsright[i] = sum;
            sum += nums[i];
        }
        for(int i = 0;i<n;i++){
            if(sumsleft[i] == sumsright[i]){
                return i;
            }
        }
        return -1;
    }
}

