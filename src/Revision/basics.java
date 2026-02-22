package Revision;
import java.util.Scanner;

public class basics{
    public static void main (String[] args){
//        System.out.println("this is my first program after 1 year");
//        System.out.println("hello chico you are the best");

        System.out.println("love chico");


//        simple interest program
        double p,r,t,si;

        p = 100;
        r = 10;
        t = 2;
        si =(p*r*t)/100;
        System.out.println("the simple interet is: " + si);





//        the area of circel
        double radius = 32;
        double pi = 3.14;
        double area  = pi * radius * radius;
        System.out.println("the area of circle is: " + area);



//        program to print volume of sphere

        double radius1 = 32;
        double pi1 = 3.14;
        double volumeOfSphere = (4/3) *(pi*radius1*radius1*radius1);
        System.out.println("the volume of sphere is: " + volumeOfSphere);








//        area of circle with input
        Scanner sc = new Scanner(System.in);
        System.out.println("emter your radius: ");
        int radius2 = sc.nextInt();

        double pi3 = 3.14;
        double area3 = pi*radius2*radius2;
        System.out.println("the area of circle with input is: " + area3);




//        take two input a and b and find reminder when a is divided by b
        System.out.println("Enter dividend: ");
        int a = sc.nextInt();
        System.out.println("Enter divisor: ");
        int b = sc.nextInt();
        int q = a/b;
        int rem =  a - (b*q);
        System.out.println("The remainder when " +a+ " is divided by "+b+" is " + rem);



//        heirarchy operators

        int i = 2*3/523+432/4+4/53-53+43/2;
        System.out.println(i);



//        predict the output


    }
}




//this is to check commit

