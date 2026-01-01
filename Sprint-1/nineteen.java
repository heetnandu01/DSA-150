// find prime numbers between two input 

import java.util.Scanner;

public class nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = sc.nextInt();
        System.out.print("Enter the end value: ");
        int end = sc.nextInt();
        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue;
            }
            if (num == 2) {
                System.out.println(num);
                continue;
            }

            int flag = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num);
            }
        }
    }
}
