package Switch;
import java.util.Scanner;
public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit: ");
        String fruit = input.next();
        if(fruit.equals("Mango")){
            System.out.println("king of fruits");

        }
        if(fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }

    }
}
