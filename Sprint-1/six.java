// GCD

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();
        while(num2 != 0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        System.out.println(num1);
    }
}
