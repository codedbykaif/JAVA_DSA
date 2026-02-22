package Revision;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("enter your first number: ");
//        int num1 = sc.nextInt();
////        System.out.println("Enter your second number: ");
////        int num2 = sc.nextInt();
//        if(num1%2==0){
//            System.out.println("the given number is even ");
//        } else{
//            System.out.println("the given number is odd ");
//        }









//        divisble by 5 or not

        System.out.println("Enter your  number");
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println("the given number is divisble by 5");

        }
        else{
            System.out.println("The given number is not divisible by 5");
        }


    }
}
