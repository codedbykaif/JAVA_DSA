package Switch;
import java.util.Scanner;
public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit: ");
        String fruit = input.next();
       switch (fruit) {
           case "Mango":
               System.out.println("king of fruits");
               break;
           case "Apple":
               System.out.println("a sweet red fruit");
               break;
           case "Orange":
               System.out.println("round fruit");
               break;
           case "Grapes":
               System.out.println("Small fruit");
               break;
           default:
               System.out.println("Please enter a valid furit");
       }

    }
}
