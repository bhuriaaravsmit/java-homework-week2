package javaprogrammes;/*
write a java programme that takes three numbers as input to calculate and print the average of the numbers

*/

import java.util.Scanner;//scanner declaration

public class Programme13 {

    public static void main(String[] args) {//main method
        double a;
        double b;
        double c;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();
        System.out.println("Enter Third number : ");
        c = s.nextInt();


        avg(a, b, c);
    }

    public static void avg(double a, double b, double c) {//static method
        double d;
        d = ((a + b + c) / 3);

        System.out.println("Average of 3 numbers  " + d);//print statement

    }


}
