package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, -2, 0, 3, 5, 6, 8, 9, 15};
        int target = 6;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        find whether the array is sorted in ascending or descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){

            if(target < arr[mid]){
                end = mid -1;
            } else  {
                start = mid + 1;
            }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
