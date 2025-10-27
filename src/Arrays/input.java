package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 1432;
        arr[3] = 123;
        arr[4] = 13242;
//        System.out.println(arr[2]);
//        Array of primitives

//        input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//
//        }
//        for (int i = 0; i < arr.length; i++) {
////
//            System.out.print(arr[i] + " ");
//        }
//
////        Array of primitives
        String[] str = new String[4];
         for(int i = 0; i < str.length; i++){
             str[i] = input.next();

         }
        System.out.println(Arrays.toString(str));
         str[1] = "kunal";
        System.out.println(Arrays.toString(str));

        }
    }

