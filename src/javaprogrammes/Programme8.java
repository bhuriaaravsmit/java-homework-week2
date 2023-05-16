package javaprogrammes;/*write a programme to calculate the area of triangle*/

import java.util.Scanner;

public class Programme8 {


    public static void main(String[] args) {
        double b;
        double h;
        double t=5.0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of base :");
        b = s.nextInt();
        System.out.print("Enter value of height :");
        h = s.nextInt();
        calculate(b,h);
    }


    public static void calculate(double b,double h){
      double  t = ( b * h / 2);
        System.out.print("Area of triangle is :" + t);

    }

}

