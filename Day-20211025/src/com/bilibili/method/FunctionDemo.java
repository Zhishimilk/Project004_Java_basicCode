package com.bilibili.method;

public class FunctionDemo {
    public static void main(String[] args) {

        helloWorld();
        helloWorld();
        method(11);
        print(5, 17);
        System.out.println();
        int num = add(12, 11);
        System.out.println(getMax(33, 22));
        int[] arr = {11, 33, 2, 4, 35};
        int[] result = method(arr);
        System.out.println(result[0]+" "+result[1]);
        //1110011
                //1100110
                //0010101
    }

    public static void helloWorld(){
        System.out.println("Hello World!");
        cnHelloWorld();
    }
    public static void cnHelloWorld(){
        System.out.println("你好世界!");
    }
    public static void method(int num){
        if(num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
    public static void print(int n, int m){
        for (int i = n; i <= m; i++) {
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int getMax(int a, int b){
        return a > b? a : b;
    }
    public static int[] method(int[] arr){
        int max = arr[0],min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] result = {max, min};
        return result;
    }
}
