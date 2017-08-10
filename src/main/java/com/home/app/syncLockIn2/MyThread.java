package com.home.app.syncLockIn2;

/**
 * Administrator
 * 2017/8/10
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operateIMainMethod();
    }
}
