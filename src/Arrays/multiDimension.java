package Arrays;
import java.util.Scanner;
public class multiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        1 2 3
        4 5 6
        7 8 9

         */
//        int[][] arr = new int[3][];

//        int [][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5},  // 1st index
//                {6, 7, 8, 9}   // 2nd index
//        };
//        System.out.println(arr2D[2][0]);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);  // no of rows
//        input
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();

            }
        }

    }
}
