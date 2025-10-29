package Questions;

public class search2D {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        int[] result = search(arr2D, target);
        if(result[0] != -1){
            System.out.println("element found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element not found ");
        }


    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }


            }
        }
        return new int[]{-1, -1};

    }
}
