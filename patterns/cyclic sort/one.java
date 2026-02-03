// gfg problem : https://www.geeksforgeeks.org/problems/sort-an-array-which-contains-1-to-n-values-using-mathematical-formula/1

public class one {
        int[] sortArray(int arr[]) {
        int i  = 0;
        
        while(i < arr.length){
            int j = arr[i] - 1;
            
            if(arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                i++;
            }
        }
        return arr;
    }
}
