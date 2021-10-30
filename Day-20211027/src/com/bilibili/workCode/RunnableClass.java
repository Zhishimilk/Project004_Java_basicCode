package com.bilibili.workCode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableClass implements Runnable{

    private static int ticket = 100;

    Lock l = new ReentrantLock();
    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        l.lock();
        while (ticket > 0) {

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName());
                System.out.println("ticket of " + ticket);
                ticket--;
            }
        }
        l.unlock();
//        sync();
//        syncStc();
    }

    //同步方法
    public /*synchronized*/ void sync(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //添加锁对象于同步代码块
        synchronized (this) {
            while (ticket > 0) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("ticket of " + ticket);
                    ticket--;
                }
            }
        }
    }
    //
    public static synchronized void syncStc(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        synchronized (RunnableClass.class){
            while (ticket > 0) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("ticket of " + ticket);
                    ticket--;
                }
            }
//        }
    }
}
