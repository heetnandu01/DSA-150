    import java.util.Scanner;

    public class two {
        public static void main(String[] args) {
            //Solving the Prime Mystery in a Programming Contest
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of num: ");
            int num = sc.nextInt();
             if(num<= 1){
                System.out.println("It is not a prime number");
                return;
            }
            if(num == 2){
                System.out.println("It is a prime number");
                return;
            }
            int flag = 0;
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("It is a not a prime number");
            }else{
                System.out.println("It is a prime number");
            }

        }    
    }
