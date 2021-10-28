package com.bilibili.workCode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
//        第7题、分析以下需求，并用代码实现：
//        (1)键盘录入6个int类型的数据存数数组arr中
//                (2)将arr数组中的内容反转
//                (3)将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
//                (4)最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
//        (5)打印最终的数组(实现了1-4步之后的数组)
//        如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
//        注：必要时候定义方法完成需求

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请录入第 "+(i+1)+" 个整数:");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("录入------------------------");
        showArr(arr);

//        int start = 0, end = arr.length-1
//        while(start < end){
//            arr[start] = arr[start] ^ arr[end]:
//            arr[end] = arr[start] ^ arr[end]:
//            arr[start] = arr[start] ^ arr[end]:
//            start++;
//            end++;
//        }

        for(int start = 0, end = arr.length-1, i = 0; i < arr.length/2; start++, end--, i++){
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
        }
        System.out.println("反转------------------------");
        showArr(arr);

        Random rd = new Random();

        for (int i = 3; i < arr.length; i+=2) {
            arr[i] = arr[i] ^ arr[i - 2];
            arr[i - 2] = arr[i] ^ arr[i - 2];
            arr[i] = arr[i] ^ arr[i - 2];
            if(i+2 >= arr.length){
                arr[i] = arr[i] ^ arr[1];
                arr[1] = arr[i] ^ arr[1];
                arr[i] = arr[i] ^ arr[1];
            }
        }
        System.out.println("交换------------------------");
        showArr(arr);
    }

    public static void showArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
