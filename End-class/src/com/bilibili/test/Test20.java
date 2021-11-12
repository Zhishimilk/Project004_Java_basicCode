package com.bilibili.test;

import java.util.Random;

public class Test20 {
    public static void main(String[] args) {

//【代码题】定义返回值类型为int类型，名为 getScore(int[] arr)的静态方法，方法内完成：获取指定数组arr中大于平均值的元素的个数，并返回
//        定义main方法，方法内完成：

//        1）.定义一个长度为5的int数组arr
        int[] arr = new int[5];

//        2）.使用随机数生成5个范围为1-99的数字存入arr中（包含1和99），之后打印数组
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(99)+1;
        }

//        3）.传递arr调用getScore(int[] arr)方法，获取方法返回值并在控制台打印输出该返回值
        int count = getScore(arr);
        System.out.println(count);
    }

    private static int getScore(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum/arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg){
                count++;
            }
        }

        return count;
    }
}
