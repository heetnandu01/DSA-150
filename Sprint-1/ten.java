// converting a temperature from Celsius (°C) to Fahrenheit (°F)

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the valur of celsius: ");
        Float c = sc.nextFloat();
        float result = (c * 9.0f/5) + 32;
        System.out.println(result);
    }
}
