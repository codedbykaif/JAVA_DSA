package conditionals_loops;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int reverse = 0;
            while(num>0){
                int last_digit = num % 10;
                reverse = reverse * 10 + last_digit;
                num = num /10;
            }
        System.out.println(" reversed number is: " + reverse);

    }
}
