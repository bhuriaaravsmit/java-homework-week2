package javaprogrammes;

/*

Write a java programme using following steps
* Declare two static variable.
* Declare one static method
* Call both static variables into the static method inside the print statement.
Declare the main method
Call the static method into the main method and run programme.
 */



public class Programme2 {
     static int a  = 10;//static variables
    static int b = 20;//static variables

    public static void main(String[] args) {//Main method

        Programme2.m1();
    }

    public static void m1(){//static method

        System.out.println("first variable: " + a + " second variable "  + b);

    }




}
