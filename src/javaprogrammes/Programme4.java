package javaprogrammes;/*

Write a java programme using following steps
* Declare two instance and two static  variables.
* Declare one instance method.
* Declare one static method.
* Call all four instance and static variables into both instance and static methods inside the print statement.
Declare the main method
Call both  instance and static  methods  into the main method and run programme.
*/

public class Programme4 {

    int a = 10;//instance method
    int b=20;//instance method
    static int c =30;//static variable
    static int d = 40;//static variable


    public static void main(String[] args) {//main method

        Programme4 obj2 = new Programme4();
        Programme4 obj =new Programme4();
        obj2.m1();
        Programme4.m2();
    }

    public void m1(){//instance method

        System.out.println("first variable is : " + a + " second variable is  : " + b + " Third variable is  : " + c + " Fourth variable is   :" +  d );
    }
   public static void m2(){//static method

       Programme4 obj =new Programme4();
       System.out.println("first variable is :" + obj.a + " second variable is  : " + obj.b + " Third variable is  :  " + c + " Fourth variable is   :" +  d );
   }

}
