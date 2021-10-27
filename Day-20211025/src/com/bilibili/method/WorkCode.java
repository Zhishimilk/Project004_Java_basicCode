package com.bilibili.method;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class WorkCode {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr= {20, 10, 30, 40, 0, 60};
        int[] arr1 = {3, 4, 3, 5, 7, 9};

//        evenNum(23);
//        System.out.println(sum(rd.nextInt(100)+1, rd.nextInt(100)+1));
//        System.out.println(arrMin(arr));
//        System.out.println(score(rd.nextInt(101)));
//        System.out.println(showCount(arr1, rd.nextInt(10)));
//        numIndex(arr1, rd.nextInt(10));
        System.out.println(score(rd.nextInt(101)));
    }


//    -----------------------------------------------------------------------方法
//        第一题：分析以下需求，并用代码实现
//        定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
//        如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
//        如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4

        public static void evenNum(int num){
            if(num < 4){
                System.out.println("执行的数不能小于4!");
                return;
            }
            for (int i = 0; i <= num; i++) {
                if(i % 2 == 0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }


//        第二题:
//        随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值

        public static void sum(int a, int b){
            System.out.println("a + b = "+(a+b));
        }


//        第三题:
//        主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
//        并返回这个数组中元素的最小值。

        public static int arrMin(int[] arr){
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }


//        第四题:
//        有定义一个方法,可以接受一个整数,
//        如果为[90,100] 这个范围方法返回’A’
//        如果为[80,90)这个范围方法返回’B’
//        如果为[70,80)这个范围方法返回’C’
//        如果为[60,70)这个范围方法返回’D’
//        如果为[0,60)这个范围方法返回’E’
//        整数不在以上范围的返回’F’

        public static char score(int num){
            System.out.println(num);
            if(num < 0 && num >100){
                return 'F';
            }
            char[] arr = {'E','E','E','E','E','E','D','C','B','A','A'};
            return arr[num/10];
//            return (char)('E'-num/90-num/80-num/70-num/60);
        }


//        第五题:
//        定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
//        如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};

        public static int showCount(int[] arr, int num){
            System.out.println(num);
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == num){
                    count++;
                }
            }
            return count;
        }


//        第六题:
//        定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
//        如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3
//        数组[1232] 要查找的数是5 则方法每部会打印 “数组中没有这个数字”

        public static void numIndex(int[] arr, int num){
            System.out.println(num);
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == num){
                    System.out.println("索引为 "+i);
                    flag = false;
                }
            }
            if(flag){
                System.out.println("数组中没有该数!");
            }
        }
}
