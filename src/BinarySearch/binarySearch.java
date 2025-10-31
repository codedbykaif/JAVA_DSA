package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, -2, 0, 3, 5, 6, 8, 9, 15};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println("your index of target element is : " + ans);

    }
//    return the index
//    return -1 if it does not xist

    static int binarySearch(int[] arr, int target ){
        int start =  0;
        int end = arr.length -1;
//        find the middle element
// might be possible that (start + end) that we are doing can exceed the range of integer in java
//        int mid = (start + end)/2;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;



    }
}
