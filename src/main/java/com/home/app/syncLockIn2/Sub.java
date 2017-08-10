package com.home.app.syncLockIn2;

/**
 * Administrator 2017/8/10
 */
public class Sub extends Main {

    @Override
    synchronized public void operateIMainMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
