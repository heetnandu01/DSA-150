// Finding Largest and Smallest in an Array

public class fourteen {
    public static void main(String[] args) {
        int [] arr = {5,3,97,34,1};
        int left = 0;
        int right = arr.length - 1;
        int max = arr[0];
        int min = arr[0];


        while(left <= right){

            if(arr[left] > max){
                max = arr[left];
            }
            
            if(arr[left] < min){
                min = arr[left];
            }

            if(arr[right] > max){
                max = arr[right];
            }

            if(arr[right] < min){
                min = arr[right];
            }
            left++;
            right--;
        }
        System.out.println("The Largest Element is: " + max);
        System.out.println("The Smallest Element is: " + min);
    }
}