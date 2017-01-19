package com.company.model;


import com.company.Press;

import java.util.List;

/**
 * Created by Yefa on 12/30/16.
 */
public class OlivePress implements Press {
    private int current;

    public int getoil (List<Olive> olives){

        int totoloil = current;
        for(Olive o :olives){
            System.out.println(o.getName());
            System.out.println(o.getColor());
            System.out.println(o.cruch());
            System.out.println(o.getN());
            System.out.println("\n");
            totoloil += o.cruch();
        }

        return totoloil;
    }

    @Override
    public void Soil(int oil) {
        current = oil;
    }

}
