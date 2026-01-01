// sum of all elements in an array 

public class sixteen {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,8};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
