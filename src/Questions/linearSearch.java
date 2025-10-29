package Questions;

public class linearSearch {
    public static void main(String[] args) {
//        search for 3 in the range of index [1,4]
        int[] num = {18, 12, -7, 3, 14, 28};
        int target = 14;
        int start = 1;
        int end = 4;
        int ans = search(num, target, start, end);
        System.out.println(ans);


    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
}
