package com.company;
import com.company.ultility.Math_helper;

import java.util.Scanner;

import static com.company.ultility.Math_helper.subtractValues;


public class Main {

    public static void main(String[] args) {
        Main cal =new Main();
        cal.caculate();
    }


    protected  void caculate() {

        InputHelper input =new InputHelper();


        String s1 = input.getInput("Enter a numeric value: ");
        String s2 = input.getInput("Enter a numeric value: ");
        String op = input.getInput("Choose an operation (+ - * /):");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = Math_helper.addValues(s1, s2);
                    break;
                case "-":
                    result = Math_helper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = Math_helper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = Math_helper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    class InputHelper {
        private  String getInput(String prompt) {
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }

    }




}





