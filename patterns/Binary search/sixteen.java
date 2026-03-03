// GFG Problem : https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

class sixteen {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if(k > n)return -1;
        int low = 0;
        int high = 0;
        for(int i = 0;i<n;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        int answer = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int students = 1;
            int pages = 0;
            for(int book:arr){
                if(pages + book <= mid){
                    pages += book;
                }else{
                    students += 1;
                    pages = book;
                }
            }
            if(students <= k){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }
}
