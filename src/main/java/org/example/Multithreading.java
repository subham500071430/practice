package org.example;

public class Multithreading {

    // to achieve multi-threading in java either extend thread class or implement runnable interface
    // thread class is in java.lang package

    public static void main(String[] args){


           Hello hello = new Hello();
           Thread thread = new Thread(hello);
           thread.start();

           for(int i=0;i<10;i++){
                System.out.println("Hi");
           }


    }

}
