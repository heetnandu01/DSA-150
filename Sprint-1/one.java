import java.util.Scanner;

public class one {
    
// Teaching a Sibling to Tell Even from Odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}



