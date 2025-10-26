package Methods;

import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
//        fun(423);
//        fun("kaif");
//        int ans = sum(42, 534);
//        System.out.println(ans);
        demo(53, 54, 64, 4354, 6443);
        demo("kaif", "rahul", "shreya");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum (int a, int b, int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }

}
