package com.bilibili.array;

import java.util.Random;
import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

//        第三题：分析以下需求，并用代码实现------------------------------------------
//        键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，
//        最后打印数组中所有值大于5且为偶数的元素.
//
//        System.out.print("请输入要创建的数组长度:");
//        int wide = sc.nextInt();
//        int[] arr = new int[wide];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rd.nextInt(10) + 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > 5 && arr[i]%2 ==0){
//                System.out.println(arr[i]);
//            }
//        }


//        第四题：分析以下需求，并用代码实现------------------------------------------
//        从键盘上输入10个整数，合法值位1、2或3，不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。
//
//        打印格式：
//        请输入10个整数：
//        数字1的个数：
//        数字2的个数：
//        数字3的个数：
//        非法数字的个数：
//        int[] arr = new int[10];
//        int cnt1=0, cnt2=0, cnt3=0, cnt4=0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rd.nextInt(10) + 1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 1){
//                cnt1++;
//            }else if(arr[i] == 2){
//                cnt2++;
//            }else if(arr[i] ==3){
//                cnt3++;
//            }else {
//                cnt4++;
//            }
//        }
//
//        System.out.println("数字1的个数："+cnt1);
//        System.out.println("数字2的个数："+cnt2);
//        System.out.println("数字3的个数："+cnt3);
//        System.out.println("不合规定数字的个数："+cnt4);


//        第五题：分析以下需求，并用代码实现------------------------------------------
//        已知数组int[] nums = {5,10,15},要求创建一个新数组
//        1.新数组的长度和已知数组相同
//        2.新数组每个元素的值 是已知数组对应位置元素的2倍
//        3.在控制台中打印新数组的所有元素
//        int[] nums = {5,10,15};
//        int[] nums2 = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums2[i] = nums[i] * 2;
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i] + " ");
//        }


//        第六题：分析以下需求，并用代码实现------------------------------------------
//        1.键盘录入班级人数
//        2.根据录入的班级人数创建数组
//        3.利用随机数产生0-100的成绩(包含0和100)
//        4.要求:
//        (1)打印该班级的不及格人数
//                (2)打印该班级的平均分
//                (3)演示格式如下:
//        请输入班级人数:
//        键盘录入:100
//        控制台输出:
//        不及格人数:19
//        班级平均分:87
        System.out.println("请输入班级人数:");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }

        int count = 0, sum = 0, avg;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 60){
                count++;
            }
            sum += arr[i];
        }
        avg = sum / arr.length;

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        System.out.println("不及格人数为: " + count);
        System.out.println("全班平均分为: " + avg);
    }
}
