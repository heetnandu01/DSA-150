// leetcode Problem : 

class three {
      public int subarraysDivByK(int[] nums, int k) {
        int currentsum = 0;
        int count = 0;
        int [] freq = new int[k];
        freq[0] = 1;
        for(int num:nums){
            currentsum += num;
            int rem = currentsum % k;
            if(rem < 0) rem += k;

            count += freq[rem];
            freq[rem]++;
        }
        return count;
    }  
}
