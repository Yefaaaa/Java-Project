package com.company;

/**
 * Created by Yefa on 1/3/17.
 */
public class Student {
    String name;
    int age;
    static int NuOfStudent =0;

    Student(){
        NuOfStudent ++;
    };

    public static int getNuOfStudent(){
        return NuOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }






}
