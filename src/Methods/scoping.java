package Methods;

public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "kaif";
    {
//        int a = 842; already initialised outside the block inside the same function
        a = 32;
        int c = 99;
        System.out.println(a);
        name = "rahul";
        System.out.println(name);
//     values initialised in this block will reamian in this block only
    }
        System.out.println(a);
        System.out.println(name);

//        Scoping in for loopx
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 89;
        }
    }
    static void random(int marks){
        int num = 78;
        System.out.println(num);
        System.out.println(marks);
    }
}
