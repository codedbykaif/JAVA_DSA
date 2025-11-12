package Questions;

public class leet_852 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));  // Output: 2
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the decreasing part of the mountain
                // This may be the answer, but look at the left
                end = mid;
            } else {
                // You are in the ascending part of the mountain
                start = mid + 1;
            }
        }

        // At the end, start == end and pointing to the peak
        return start;
    }
}
