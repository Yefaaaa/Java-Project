package com.company.model;

/**
 * Created by Yefa on 12/30/16.
 */
public enum Enum {
    QWE("qwe"),WER("wer");


    private String name;

    Enum(String name){

        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }





}
