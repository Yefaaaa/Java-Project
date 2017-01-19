package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.server.ExportException;

public class Main {

    public static void main(String[] args) {

        // Copy the file
        String souceF ="file/file.txt";
        String targetF = "file/taget.txt";

        try(
                FileReader fd =new FileReader(souceF);
                BufferedReader bR =new BufferedReader(fd);
                FileWriter WF =new FileWriter(targetF);

        ){
            while(true){
                String line = bR.readLine();
                if (line ==null){
                    break;
                }else {
                    WF.write(line+ "\n");
                }
            }
            System.out.println("File copy");

        }catch (Exception e){
            e.printStackTrace();

        }





    }
}
