package Methods;

import org.w3c.dom.ls.LSOutput;

public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        func();
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        System.out.println(x);
    }
    static void func(){
        System.out.println(x);
    }

}
