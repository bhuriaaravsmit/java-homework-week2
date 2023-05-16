package javaprogrammes;/*

Write a java programme using following steps
* Declare one instance and one static  variable.
* Declare one instance method
* Declare one static method
* Call both instance and static variables into the instance and static method inside the print statement.
Declare the main method
Call both  instance and static  methods  into the main method and run programme.

*/

public class Programme3 {
    int a = 10;//instance variable

    static int b = 20;//static variable

    public static void main(String[] args) {//main method

        Programme3 obj = new Programme3();
        obj.m1();
        Programme3.m2();

    }

    public void m1() {//instance method

        System.out.println("Value of first variable: " + a + " Value of second variable " + b);

    }

    public static void m2() {//static method
        Programme3 obj = new Programme3();
        System.out.println("first variable: " + obj.a + " second variable : " + b);

    }


}
