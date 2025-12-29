//  Quickly Summing Natural Numbers for a Math Challenge

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=num;i++){
            sum = sum + i;
        } 
        System.out.println(sum);


        // Second solutio to the code 
        
        // int sum = num * (num + 1) /2 ;
        // System.out.println(sum);
    }
}
