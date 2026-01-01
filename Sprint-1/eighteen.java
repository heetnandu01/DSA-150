// multiplication of a table 

import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
