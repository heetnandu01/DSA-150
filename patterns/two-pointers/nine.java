// leetcode problem : https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

import java.util.Arrays;

class nine {
     long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        for(int i = 0;i<arr.length -2;i++){
            int left = i+1;
            int right = arr.length - 1;
            while(left < right){
                long add = arr[i] + arr[left] + arr[right];
                if(add < sum){
                    count += (right - left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}
