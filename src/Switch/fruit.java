package Switch;
import java.util.Scanner;
public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit: ");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid furit");
        }

    }
}
