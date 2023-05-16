package javaprogrammes;/*write a java programme for swapping variables*/

import java.util.Scanner;

public class Programme15 {

    public static void main(String[] args) {//main method
      String a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first variable  : ");

        a = s.nextLine();
        System.out.println("Enter second variable  : ");
        b = s.nextLine();
        System.out.println("before swapping variable " + a + " " + b);
        c = a;
        a = b;
        b = c;

        System.out.println("After swapping  variable " + a + " " + b);

    }


}
