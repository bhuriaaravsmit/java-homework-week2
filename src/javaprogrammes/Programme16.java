package javaprogrammes;/*Write a java programme to add two binary numbers*/


public class Programme16 {

    public static void main(String[] args) {//Main method

        String first = "10";
        String second = "11";

        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);

        int sum = b1 + b2;

        //Integer.toBinaryString(sum);
        String a = Integer.toBinaryString(sum);

        System.out.println("sum of two binary numbers :  " + a);


    }


}
