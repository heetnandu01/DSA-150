// Armstrong numbers

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of start: ");
        int start = sc.nextInt();
        System.out.print("Enter the value of end: ");
        int end = sc.nextInt();
        for(int num = start;num <= end;num++){
            int original = num;
            int temp = num;
            int sum = 0;


            while(temp > 0){
                int digit = temp % 10;
                sum = sum + digit * digit *digit;
                temp = temp / 10;
            }

            if(sum == original){
                System.out.println(original);
            }
        }
    }
}
