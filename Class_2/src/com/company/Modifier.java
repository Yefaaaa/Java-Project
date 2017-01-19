package com.company;

/**
 * Created by Yefa on 1/3/17.
 */
public class Modifier {
    /*
     * Modifier            Class       Package   Subclass   World
     * public                Y            Y          Y        Y
     * protected             Y            Y          Y        N
     * no modifier           Y            Y          N        N
     * private               Y            N          N        N
     *
     *
     *  Alwasys set as privage and protected
     * */
    public  String name;
    protected double num;
    int age;
    private float n;

    // To set the n and get the n
    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }


}
