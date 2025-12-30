// LCM

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = sc.nextInt();
        if(num1 == 0 || num2 == 0){
            System.out.println(0);
        }

        int a = num1;
        int b = num2;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int lcm = (num1 * num2) / a;
        System.out.println(lcm);

    }
}
