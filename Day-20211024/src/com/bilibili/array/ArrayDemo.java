package com.bilibili.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        //------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
//        part no,1---------------------------------------
//        char[] cArr = {'我', '能', '够', '做', '到'};
//        String[] cArr1 = {"we", "can", "do", "it"};
//        for (int i = 0; i < cArr.length; i++) {
//            System.out.print(cArr[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < cArr1.length; i++) {
//            System.out.print(cArr1[i]+" ");
//        }

//        part no.2---------------------------------------
//        int[] arr = {22, 33, 114514, 666, 233};
//        System.out.print("输入你想查找的数据:");
//        int num = sc.nextInt();
//
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num){
//                index = i;
//            }
//
//        if(index == -1){
//            System.out.println("没有找到你想要的数据!");
//        }else {
//            System.out.println("你要找到数在索引为 "+index+" 的位置");
//        }

//        part no.3---------------------------------------
//        int[] arr = new int[6];
//        int sum = 0, max = 0, min = 0, avg;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("输入第"+i+"个评委答分");
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//
//        max = arr[0];
//        min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }else if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//
//        avg = (sum - max - min) / (arr.length - 2);
//        System.out.println("最大值为: "+max+" , 最小值为: "+min+" , 平均分为: "+avg);


//        part no.4---------------------------------------
//        1、小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
//        请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
//        赚钱的股票一共有：4只
//        赔钱的股票一共有：6只
//        double[] shares = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
//        //count统计盈利的股票, count1统计亏损的股票
//        int count = 0, count1 = 0;
//        for (int i = 0; i < shares.length; i++) {
//            if(shares[i] > 0){
//                count++;
//            }else if(shares[i] < 0){
//                count1++;
//            }
//        }
//        System.out.println("赚钱的股票一共有: " + count);
//        System.out.println("赔钱的股票一共有: " + count1);


//        part no.5
//        2、定义长度为10的int数组,数组中的10个元素为随机生成的1-100的数字,要求:按格式打印数组中的元素内容
//        举例:
//        数组原内容:{1,2,3,4,5}
//        打印的内容:[1, 2, 3, 4, 5]
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rd.nextInt(100) + 1;
//        }
//
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if(i != arr.length - 1){
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");


//        part no.6
//        int[] month = new int[sc.nextInt()];
//        for (int i = 0; i < month.length; i++) {
//            if(i >= 2){
//                month[i] = month[i-1] + month[i-2];
//            }else {
//                month[i] = 1;
//            }
//        }
//
//        for (int i = 0; i < month.length; i++) {
//            System.out.print(month[i] + " ");
//        }
//        System.out.println();


//        part no.7
//        int[] arr = {1, 2, 3, 4, 5};
//        int num = 0;
//        for (int i = 0; i < arr.length; i++) {
//            num = num * 10 + arr[i];
//        }
//        System.out.println(num);


//        part no.8
        int[] arr = {11, 12, 7, 22, 66, 88, 34, 21, 33, 44, 71, 89};
        int left = 0, right = arr.length -1,  cup;

        while(left < right){
            //从左边开始寻找偶数
            while(arr[left]%2 != 0 && left < right){
                left++;
            }
            //从右边开始寻找奇数
            while(arr[right]%2 == 0 && left < right){
                right--;
            }
            //交换奇数和偶数的位置
            if(left < right){
//                cup = arr[left];
//                arr[left] = arr[right];
//                arr[right] = cup;
                arr[left] = arr[left]^arr[right];
                arr[right] = arr[left]^arr[right];
                arr[left] = arr[left]^arr[right];
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();

        reversal(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }



        sc.close();

        //------------------------------------------------------
        long l2 = System.currentTimeMillis();
        System.out.println("本次程序共运行 " + (l2 - l)/1000 +"s");
    }

    public static void reversal(int[] arr){
        int start = 0, end = arr.length - 1, cup;
        for (; start < end; start++, end--) {

            cup = arr[start];
            arr[start] = arr[end];
            arr[end] = cup;
        }
    }
}
