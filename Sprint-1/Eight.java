//  palindrome of a String 

// import java.util.Scanner;

// public class seven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of String");
//         String str = sc.nextLine();
//         String original  = str;
//         String rev = new StringBuilder(str).reverse().toString();

//         if(original.equals(rev)){
//             System.out.println("It is true and string is palindrome");
//         }else{
//             System.out.println("String is not palindrome");
//         }
//     }
// }



import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(original == rev){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}



