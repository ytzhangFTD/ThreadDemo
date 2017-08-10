package com.home.app.test;

/**
 * Administrator 2017/8/8
 */
public class Client {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            Thread thread=new Thread(myThread);
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch ");
            e.printStackTrace();
        }
    }
}
