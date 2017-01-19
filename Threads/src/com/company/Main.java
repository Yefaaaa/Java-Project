package com.company;









class myclas implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId()+" "+i);
        }
        // Run in concurrency
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Myclass extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId()+" "+i);
        }
        // Run in concurrency
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Main {
    private static int count =0;

    //accecss one thread in a time
    public static synchronized void inccount(){
        count++;
    }

    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        myclass.start();

        Myclass my =new Myclass();
        my.start();

      Thread t1 = new Thread(new myclas());
      t1.start();

      Thread t2 = new Thread(new myclas());
      t2.start();


      // simple way to create a Thread
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100000;i++){
                    inccount();
                }
            }
        });



        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100000;i++){
                    inccount();
                }
            }
        });

        t3.start();
        t4.start();


        try {
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(count);







    }
}
