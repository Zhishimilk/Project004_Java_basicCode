package com.bilibili.workCode;

public class RunnableClass implements Runnable{

    private int ticket = 100;
    Object o = new Object();
    @Override
    public void run() {

        //添加锁对象于同步代码块
        while( ticket > 0) {
            synchronized(o) {

//                try {
//                    Thread.sleep(20);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                if(ticket > 0) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("ticket of " + ticket);
                    ticket--;
                }
            }
        }
    }
}
