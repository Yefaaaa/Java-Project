package com.company;

/**
 * Created by Yefa on 1/3/17.
 */
public class Final extends Student {

  /*
    A final class cannot be subclass
    A final method cannot be override by subclassed
    A final variable can only be initializied once.
   */


    // constain
    public final int number;


    public Final() {
        number = 10;
    }
}
