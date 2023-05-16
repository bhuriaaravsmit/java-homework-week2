package javaprogrammes;/*
write a programme to enter any radius value of the circle and find out the area.(formula of area =pi*r*r)
*/

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {//main method

        int r;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius value :-");
        r=s.nextInt();
        m1(r);//calling static method
    }

    public static void m1(int r){//static method
;
        double pi=3.14;
        double c=pi*r*r;
        System.out.println("Area of the circle : " + c);//string concatenation
    }
}
