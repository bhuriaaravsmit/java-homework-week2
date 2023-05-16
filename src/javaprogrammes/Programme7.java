package javaprogrammes;/*

write a programme to insert any temperature value in degree Fahrenheit and convert to degree Celsius*/

import java.util.Scanner;//scanner declaration

public class Programme7 {

    public static void main(String[] args) {//main method
        double f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature :-");
        f = s.nextInt();
        convert(f);//calling static method
    }

    public static void convert(double f) {//static method

        double a;

        a = ((f - 32) * 5 / 9);
        System.out.println("The degree celsius  "  +  a);

    }

}
