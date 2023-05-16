package javaprogrammes;/*

write a java programme that takes a number as input and prints its multiplication table up to 10 */

import java.util.Scanner;//scanner declaration

public class Programme10 {
    public static void main(String[] args) {
        int a;
        int c;
        int num1, num2;

       Scanner t=new Scanner(System.in);

        System.out.print("Test data : Input a number : ");
        a=t.nextInt();

        System.out.println("num1 " +   "* "  + " 1 " + " ="  +(a*1));
        System.out.println("num1 " +   "* "  + " 2 " + " ="  +(a*2));
        System.out.println("num1 " +   "* "  + " 3 " + " ="  +(a*3));
        System.out.println("num1 " +   "* "  + " 4 " + " ="  +(a*4));
        System.out.println("num1 " +   "* "  + " 5 " + " ="  +(a*5));
        System.out.println("num1 " +   "* "  + " 6 " + " ="  +(a*6));
        System.out.println("num1 " +   "* "  + " 7 " + " ="  +(a*7));
        System.out.println("num1 " +   "* "  + " 8 " + " ="  +(a*8));
        System.out.println("num1 " +   "* "  + " 9 " + " ="  +(a*9));
        System.out.println("num1 " +   "* "  + " 10 " + " =" +(a*10));


    }

}
