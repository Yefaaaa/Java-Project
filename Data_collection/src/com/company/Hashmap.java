package com.company;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Yefa on 12/30/16.
 */
public class Hashmap {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("ca","sf");
        map.put("cn","bj");
        map.put("il","asd");
        System.out.println(map);

        map.put("nv","reno");
        System.out.println(map);

        String cap =map.get("ca");
        System.out.println(cap);

        map.remove("ca");
        System.out.println(map);







    }
}
