// Automating Factorial Calculation for Combinatorics

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
