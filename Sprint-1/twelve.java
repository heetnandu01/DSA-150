// Count Vowels and Consonants in a String

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of String: ");
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0;i<str.length();i++){
            char  ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("The amount of vowels is: " + vowels);
        System.out.println("The amount of constants is: " + consonants);
    }
}