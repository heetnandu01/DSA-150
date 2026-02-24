// GFG Problem : https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1

public class two {
        public int findCeil(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int answer = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }
}
