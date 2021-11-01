package com.bilibili.taskCode;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
//        第三题: 分析以下需求,并用代码实现
//        1.键盘录入一个字符串
//        2.将该字符串变成字符数组(不能使用toCharArray()方法)
//        3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
//        4.如果第一位和最后一位的内容不相同,则交换
//        5.将字符数组中索引为偶数的元素变成'~'
//        6.打印数组元素的内容

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }

        if(arr[0] != arr[arr.length-1]){
            char temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }

        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = '~';
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
