package com.bilibili.reflection;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int[] arr = new int[2];
        double[] dArr = new double[2];
        boolean[] bArr = new boolean[2];

        System.out.println(arr[0]);
        System.out.println(dArr[0]);
        System.out.println(bArr[0]);

        System.out.println("---------------------");

        arr[0] = 22;
        dArr[0] = 33.0;
        bArr[0] = true;

        System.out.println(arr[0]);
        System.out.println(dArr[0]);
        System.out.println(bArr[0]);
    }
}
