// Reverse a string 

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a String: ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        int i = 0,j = str.length()-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;   
        }
        String reversed = new String(arr);
        System.out.println(reversed);
        
    }
}
