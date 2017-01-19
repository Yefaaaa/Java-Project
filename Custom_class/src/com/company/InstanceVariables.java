package com.company;

import com.company.model.KAL;
import com.company.model.Olive;
import com.company.model.OlivePress;
import com.company.model.Enum;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Yefa on 12/30/16.
 */
public class InstanceVariables {

    public static void main(String[] args){
        List<Olive> olives =new ArrayList<>();





        Olive olive1 = new Olive(Enum.QWE, 0x3E2342, 1) {
            @Override
            public String getOrigin() {
                return null;
            }
        };
        olives.add(olive1);

        olives.add(new Olive(Enum.WER, 0x3E2982, 4) {
            @Override
            public String getOrigin() {
                return null;
            }
        });

        Olive olive4 = new Olive("Mai", 0x3E2381, 5) {
            @Override
            public String getOrigin() {
                return null;
            }
        };
        olives.add(olive4);


        Olive olive3 =new KAL();
        olives.add(olive3);

        olive3.setOil(4);


        OlivePress press = new OlivePress();
        int total = press.getoil(olives);

        Press press1 = new OlivePress();
        press1.Soil(5);

        Press press2 =new Press() {
            @Override
            public int getoil(List<Olive> olives) {
                return 0;
            }

            @Override
            public void Soil(int oil) {

            }
        };


        System.out.println("Totoal olive oil:" + total);








    }

}
