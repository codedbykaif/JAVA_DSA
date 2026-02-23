package Revision;
import java.util.Scanner;



public class greatestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your first number: " );
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number:");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is greatest: " + num1);

        }
        else if(num2>num1 && num2>num3){
            System.out.println("number 2 is greatest: " + num2 );
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Number 3 is greatest: "+ num3);
        }
        else{
            System.out.println("Invalid input");
        }



    }

}
