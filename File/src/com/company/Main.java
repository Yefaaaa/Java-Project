package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
      file_write();
      file_read();

    }
    public static void file_write(){
        // write to the file
        File file =new File("File.txt");
        System.out.println("Example--write");
        if (!file.exists()){
            System.out.println("File not there");

            try {
                file.createNewFile();
                PrintWriter pw =new PrintWriter(file);
                pw.println("This is a try");
                pw.println(123123);
                pw.close();
                System.out.println("done");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void file_read(){
        // Read from the file
        System.out.println("Example--read");
        BufferedReader br =null;
        try{
            br =new BufferedReader(new FileReader("file/File.txt"));
            String line;
            while ((line =br.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
