package com.company.model;

/**
 * Created by Yefa on 12/30/16.
 */
public abstract class Olive {

//constant
    public static final String KAL= "LASDJIWA";


    private Enum name = Enum.QWE;
    private long color = 0x2E0854;
    private int oil = 3;
    private String n = "Yefa";

// Constructor
    public Olive(){};

    public  Olive(Enum name,long color,int oil){
        this.name =name;
        this.color = color;
        this.oil =oil;
    };

    public Olive(String n,long color,int oil){
        this.n =n;
        this.color = color;
        this.oil =oil;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Enum getName() {
        return name;
    }

    public void setName(Enum name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int cruch() {
        String msg = name + " asd" +oil+ "ad"+getOrigin();
        System.out.println(msg);
        System.out.println("Ouch");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }



    public abstract String getOrigin();

}
