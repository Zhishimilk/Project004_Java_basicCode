package com.bilibili.workCode;

public class ThreadDemo {
    public static void main(String[] args) {

//        //创建抽象类Thread的匿名内部类
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        t.start();
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        new Thread(r).start();


        //具有线程安全的代码
        RunnableClass rc = new RunnableClass();
        new Thread(rc).start();
        new Thread(rc).start();
        new Thread(rc).start();
    }
}
