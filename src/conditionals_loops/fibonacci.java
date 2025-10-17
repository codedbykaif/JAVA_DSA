package conditionals_loops;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Nth number: ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
//        int count = 2;
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.println(" " + next);
            first = second;
            second = next;
        }
    }

    }

