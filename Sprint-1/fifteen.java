// sort the array in ascending number 

public class fifteen {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 1, 97, 99, 76, 34, 65, 45, 30 };
        // 1st Method 
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
