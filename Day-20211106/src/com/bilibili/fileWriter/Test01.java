package com.bilibili.fileWriter;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        //键盘录入
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+i+"个1-60之间的数字:");
            arr[i] = sc.nextInt();
        }

        //条件随即数
        int num = rd.nextInt(9) + 2;
        System.out.println("生成的随机数为: " + num);


        //按条件对数组进行筛选
        System.out.println("符合条件的元素为:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % num != 0){
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
