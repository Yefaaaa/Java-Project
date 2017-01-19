package com.company;

import java.math.BigDecimal;

/**
 * Created by Yefa on 12/29/16.
 */
public class Data_convert {

    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Byte : " + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte : " + b);


        /* double number to fit the exactly decimal
           it uses the string to add together    */

        double a = .012;
        double Sum_ = a + a + a;
        System.out.println("Sum of primitive: " + Sum_);

        String str = Double.toString(a);
        System.out.println("strvalue: " + str);


        BigDecimal bigvalue = new BigDecimal(str);
        BigDecimal bSum = bigvalue.add(bigvalue).add(bigvalue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());


    }
}
