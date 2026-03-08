// leetcode problem : https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/

class twentyone {
        public int findKthNumber(int m, int n, int k) {
        int low=0, high=m*n;
        while (low < high) {
            int mid=(low+high)/2, count=0;
            for (int i=1; i<=m; i++)
                count += n < mid/i ? n : mid/i;
            if (count >= k)
                high = mid;
            else 
                low = mid+1;
        }
        return low;
    }
}
