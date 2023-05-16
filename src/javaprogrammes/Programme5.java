package javaprogrammes;/*

write a programme for a calculator with addition ,subtraction,multiplication, and division methods all with parameters and use string concatenation methods

*/

import java.util.Scanner;//scanner declaration

public class Programme5 {

    public static void main(String[] args) {//main method

        int a ;
        int b ;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of first digit :-");
        a=s.nextInt();
        System.out.print("Enter value of second digit :-");

        b=s.nextInt();

        Programme5 obj = new Programme5();
        obj.addition(a, b);
        obj.subtraction(a, b);

        multiplication(a, b);
        division(a, b);
    }

    public void addition(int a, int b) {//instance method
        int c = a + b;
        System.out.println("addition of two numbers : " + c);
    }

    public void subtraction(int a, int b) {//instance method
        int c = a - b;
        System.out.println("subtraction of two numbers : " + c);
    }

    public static void multiplication(int a, int b) {//static method
        int c = a * b;
        System.out.println("multiplication of two numbers : " + c);

    }

    public static void division(int a, int b) {//static method
        int c = a / b;

        System.out.println("division of two numbers : " + c);
    }

}
