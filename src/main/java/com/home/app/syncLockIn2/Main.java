package com.home.app.syncLockIn2;

/**
 * Administrator 父级方法 2017/8/10
 */
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
