package conditionals_loops;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        take input from user till user does not pres x or X
        int ans = 0;
        while(true){
//            take the operator as an input
            System.out.println("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                input two numbers
                System.out.println("Enter two number: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();

            if(op == '+'){
                ans = num1 + num2;
            }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
                else if (op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.println("invalid operations !!");

                }
            }
            System.out.println(ans);
        }

    }
}
