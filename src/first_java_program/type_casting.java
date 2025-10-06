package first_java_program;
import java.util.Scanner;
public class type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
//        float num = input.nextFloat();
//        System.out.println(num);
//        int num = (int)(3242.432f);
//        System.out.println(num);

        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);



    }
}
