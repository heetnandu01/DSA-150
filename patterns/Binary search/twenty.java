// leetcode problem :  https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

class twenty {
       public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0] , high = matrix[n-1][n-1];
        int ans = high;
        while(low <= high){
            int mid = low +(high - low)/2;
            int count = helper(matrix,mid,n);
            if(count >= k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int helper(int[][] matrix ,int x,int n){
        int row = 0,col = n-1;
        int res = 0;
        while(row < n && col >= 0){
            if(matrix[row][col] <= x){
                res += (col + 1);
                row++;
            }else{
                col--;
            }
        }
        return res;
    }
}
