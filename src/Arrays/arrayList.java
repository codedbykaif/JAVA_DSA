package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

////        syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(42);
//        list.add(32);
//        list.add(62);
//        list.add(66);
//        list.add(63);
//        System.out.println(list);
//
//
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

//        get item
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] this syntax will not work here

        }
        System.out.println(list);


    }
}
