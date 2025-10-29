package Questions;

public class minElement {
    public static void main(String[] args) {
        int[] arr = {23, 233, 333, 234, 542,4242, 653, 732, 5328, 923};
        int min = findMin(arr);
        System.out.println("minimum element is : " + min);
    }
    static int findMin(int[] arr){
        int min = arr[0];  //first element is minimum
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <min){
                min = arr[i];
            }
        }
        return min;
    }
}
