package com.bilibili.workCode;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        第2题、分析以下需求，并用代码实现：
//        1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
//        2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
//        3.在main方法中打印该数字是几位数
//        4.演示格式如下:
//        (1)演示一:
//        请输入一个整数:1234
//        控制台输出:1234是4位数字
//                (2)演示二:
//        请输入一个整数:-34567
//        控制台输出:-34567是5位数字
        Scanner sc = new Scanner(System.in);
        int wide = numWide(sc.nextInt());
        System.out.println(wide);

    }

    public static int numWide(int num){

        int wide = 1;
        while(num/10 != 0){
            num = num/10;
            wide++;
        }
        return wide;
    }
}
