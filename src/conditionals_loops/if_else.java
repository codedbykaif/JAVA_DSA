package conditionals_loops;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
//;        if(salary > 10000){
//            salary += 2000;
//        } else {
//            salary += 1000;
//        }
//        System.out.println(salary)
//

//        multiple else if conditions
        if(salary > 10000){
            salary += 2000;
        } else if(salary > 20000){
        salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        }


}
