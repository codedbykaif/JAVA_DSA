package Methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(32, 432, 543, 6434, 644, 6434);
        multiple(21, 2343, "kaif", "againkaif");

    }
      static void  multiple(int a, int b, String ...v){

      }
    static void fun(float ...v){
        System.out.println(Arrays.toString(v));
    }
}
