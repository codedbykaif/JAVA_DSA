package Methods;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
//       int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20, 43);
        System.out.println(ans);


    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }
//    return the value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;

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

