// Geeksforgeeks problem : https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1

class two {
       static int smallestSumSubarray(int a[], int size) {
        int minsum = Integer.MAX_VALUE;
        int currentsum = 0;
        for(int i = 0;i<size;i++){
            currentsum = currentsum + a[i];
            minsum = Math.min(minsum,currentsum);
            
            if(currentsum > 0){
                currentsum = 0;
            }
        }
        return minsum;
    }
}
