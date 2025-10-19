package Methods;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        sum();

    }
   static void sum(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of the numbers is: " + sum);

    }
}

