// leetcode problem : https://www.geeksforgeeks.org/problems/aggressive-cows/1

import java.util.Arrays;

class twelve {
        public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int answer = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = 1;
            int lastPlaced = stalls[0];
            for(int i = 1; i < n; i++){
                if(stalls[i] - lastPlaced >= mid){
                    count++;
                    lastPlaced = stalls[i];
                }
            }
            if(count >= k){
                answer = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        } 
        return answer;
    }
}
