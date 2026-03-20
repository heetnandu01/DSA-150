// GFG Problem : https://www.geeksforgeeks.org/problems/rotation4723/1

class PBinarySearchEight {
     public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] < arr[high]){
                high = mid;
            }else if(arr[mid] > arr[high]){
                low = mid + 1;
            }
        }
        return low;
    }
}
