package Questions;
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num =  input.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);



    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        if( c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
