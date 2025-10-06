import java.util.Scanner;
public class temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your temprature: ");

        float tempC= input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);




    }



}
