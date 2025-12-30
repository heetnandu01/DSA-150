// extra question : sum of n natural even numbers 

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =0;i<=num;i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
