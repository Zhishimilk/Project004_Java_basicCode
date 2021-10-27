package com.bilibili.method;

public class OverLoad {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        showArr(arr);
    }

    public static void showArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    void showArr(int[] arr, int index){};
}
