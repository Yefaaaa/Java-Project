package com.company;

/**
 * Created by Yefa on 12/29/16.
 */
public class Math_operate {
    public static void main(String[] args) {
        int i1 =56;
        int i2 =42;

        int s  = i1 + i2;
        System.out.println("Additicon : "+ s);

        int a  = i1 - i2;
        System.out.println("Subjection : "+ a);

        int b  = i1 * i2;
        System.out.println("Multiplcation : "+ b);

        double c  = (double)i1 /  i2;
        System.out.println("Diviction : "+ c);

        double d  = (double) i1 % i2;
        System.out.println("Reminder : "+ d);


        // round a value

        double d1 =-3.9999999;
        long round =Math.round(d1);
        System.out.println("Rounded : "+ round);

        double absv = Math.abs(d1);
        System.out.println("Absoulte : "+ absv);










    }
}