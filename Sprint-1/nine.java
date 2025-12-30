// Counting Character Frequencies to Reveal Patterns

import java.util.Scanner;

public class nine {


    static int fib(int num){
        if(num == 1){
            return 0;
        }
        if(num == 2){
            return 1;
        }
        return fib(num-1) + fib(num -2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        int result = fib(num);
        System.out.println(result);
    }
}
