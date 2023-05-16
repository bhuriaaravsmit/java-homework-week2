package javaprogrammes;
/*
Write a java programme using following steps
* Declare two instance variable.
* Declare one instance method
* Call both instance variables into the instance method inside the print statement.
Declare the main method
Call the above instance method into the main method and run programme.
 */
public class Programme1 {
    int a = 10;// instance variable
    int b = 20;//instance variable

    public static void main(String[] args) {//main method

        Programme1 obj = new Programme1();
        obj.m1();
    }

    public void m1() {//instance method

        System.out.println("Value of first variable: " +  a  + " Value of second variable " + b );//string concatenation

    }

}



