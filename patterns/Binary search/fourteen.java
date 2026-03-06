//leetcode problem : https://leetcode.com/problems/maximum-candies-allocated-to-k-children/description/

class Fourteen {
     public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int answer = 0;
        int high = 0;
        for(int c:candies){
            high = Math.max(high,c);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            long pieces = 0;
            for (int pile : candies) {
                pieces += pile / mid;
            }
            if(pieces >= k){
                answer = mid;
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return answer;
    }
}
