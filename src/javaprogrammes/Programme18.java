package javaprogrammes;/* write a java programme to print the sum(addition),multiply,subtract,divide and remainder of two numbers.*/

import java.util.Scanner;//scanner declaration

public class Programme18 {

    public static void main(String[] args) {//main method
        int num1, num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number :  ");
        num1 = in.nextInt();
        System.out.println("Input Second number:  ");
        num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + "= " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + "= " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + "= " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + "= " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + "= " + (num1 % num2));


    }
}
