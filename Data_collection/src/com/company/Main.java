package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

            System.out.println("Arrary of Primitivs");
            int [] i = {3,2,1,4,5};
            Arrays.sort(i);
            for (int j = 0; j <i.length ; j++) {

                System.out.println(i[j]);
            }

            System.out.println("Array of strings");
            String [] s ={"1","2","3","4"};
            for (int j = 0; j <s.length ; j++) {

                System.out.println(s[j]);
            }
            Arrays.sort(s);
            for (int j = 0; j <s.length ; j++) {

                System.out.println(s[j]);
            }


            System.out.println("Setting an initial size");

            int [] sizesd =new int[10];



           for (int value:sizesd) {
               System.out.println(value);

            }

            System.out.println("Copying an array");

           int [] copy =new int[5];
           System.arraycopy(sizesd,5,copy,0,5);
        for (int j = 0; j <copy.length ; j++) {
            System.out.println(copy[j]);
        }


        }

}
