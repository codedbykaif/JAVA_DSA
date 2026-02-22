package Revision;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of sub1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks of sub2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks of sub3: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks of sub4: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks of sub5: ");
        int sub5 = sc.nextInt();

        double sum  = (sub1+sub2+sub3+sub4+sub4);

        double percentage = sum/5;
        System.out.println("your percentage is: " + percentage);

        if(percentage>90){

            System.out.println("Excellent");
        } else if (percentage>80) {
            System.out.println("Very good");
            
        } else if (percentage>70) {
            System.out.println("good");
        }
        else if(percentage>60){
            System.out.println("can do better");
        } else if (percentage>50) {
            System.out.println("average marks");

        } else if (percentage>40) {
            System.out.println("below marks");


        }
        else {
            System.out.println("fail");
        }


    }
}
