package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());


        System.out.println(date.getMonth());

        SimpleDateFormat sd = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
        System.out.println(sd.format(date));




    }
}
