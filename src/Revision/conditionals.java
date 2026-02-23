package Revision;
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%5==0 || num%3==0) {
            if(num%15!=0){
                System.out.println("The number is divisble by 5 or 3 but not divisible 15");
            }
            else {
                System.out.println("not matching the required condtion: ");

            }


        }
        else{
            System.out.println("not matching the required condtion");
        }



    }

}
