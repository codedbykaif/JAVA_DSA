package Methods;

public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "kaif";

    {
        a = 32;
        int c = 99;
        System.out.println(a);
        name = "rahul";
        System.out.println(name);

    }
        System.out.println(a);
        System.out.println(name);

    }
    static void random(int marks){
        int num = 78;
        System.out.println(num);
        System.out.println(marks);


    }
}
