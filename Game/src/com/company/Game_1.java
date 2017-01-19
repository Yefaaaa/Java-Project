package com.company;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yefa on 1/4/17.
 */
public class Game_1 {
    private int max =100;
    private int min =1;
    private int random;
    private int input;

    Game_1(){};

    public void start(){
        String input;
        Boolean check;
        Random rand = new Random();
        this.random = rand.nextInt(100)+1;
        Scanner A =new Scanner(System.in);
        do {
            try {
                System.out.printf("Please enter the number between %d ~ %d: ",this.min,this.max);
                input = A.nextLine();
                this.input =Integer.parseInt(input);
                check = false;
            } catch (NumberFormatException e) {
                check = true;
            } finally {
                    if (this.input<this.random && this.input >this.min && this.input<this.max){
                        this.min =this.input;
                        check =true;
                    }else if (this.input >this.random&& this.input >this.min && this.input<this.max){
                        this.max =this.input;
                        check =true;
                    }else if (this.input ==this.random){
                        System.out.println("Congratulation!!");
                        System.out.println("You are win!!");
                    }else if (this.input == 0){
                        check =true;
                    } else {
                        System.out.println("Enter the number not in the range.(no include the max and the min)");
                        check =true;
                    }
            }
        }while(check);
    }
}
