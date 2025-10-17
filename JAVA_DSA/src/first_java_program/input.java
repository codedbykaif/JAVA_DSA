package first_java_program;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Your name is " + name);
        int roll_no = input.nextInt();
        System.out.println("your roll no is " + roll_no);
    }
}
