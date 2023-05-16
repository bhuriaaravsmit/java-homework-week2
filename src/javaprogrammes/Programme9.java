package javaprogrammes;

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {

        String a;
        String b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sentence :- ");
        a = s.nextLine();
        m1(a);
    }

    public static void m1(String a) {
        String b;
        b=a.toLowerCase();
        System.out.println("lower case   "  + b  );

    }


}
