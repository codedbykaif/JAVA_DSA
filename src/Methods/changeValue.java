package Methods;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {

//        create an array
        int[] arr = {1, 2, 53, 6, 45, 64};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums){
        nums[0] = 99;

    }
}
