package LinearSearch;

public class main {
    public static void main(String[] args) {
        int[] nums = {12, 32, 4, 53, 534, 542, 432, 43, 22, 11, -12};
        int target = 1;
            int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
//    search in the array: retrun the index if item found otherwise return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
//        run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }


        }
//        this line will execute if none of above's return statements have executed
//        hence target not found
        return -1;

}
}