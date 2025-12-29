// Detecting Leap Years While Building a Calendar App

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not a leap Year");
        }
    }

}
