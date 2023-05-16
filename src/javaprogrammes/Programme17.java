package javaprogrammes;/*Write a programme to convert a decimal number to binary number*/

import java.util.Scanner;

public class Programme17 {

    public static void main(String[] args) {//main method

        int a;
        String c;

        Scanner s = new Scanner(System.in);
        System.out.print("Input a decimal number :  ");
        a = s.nextInt();

        c = Integer.toBinaryString(a);
        System.out.println("Binary number is :  " + c);


    }


}
