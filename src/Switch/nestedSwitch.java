package Switch;
import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();
        switch (empId) {
            case 1 -> System.out.println("kaif");
            case 2 -> System.out.println("Md kaif");
            case 3 -> {
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");

                }
            }
            default -> System.out.println("Enter correct empId");
        }
    }
}
