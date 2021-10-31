package com.bilibili.taskCode;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*第一题：分析以下需求，并用代码实现
        我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
        请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
        规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。*/

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入身份证：");
            String idCN = sc.nextLine();
            System.out.println(idCN.length());
            System.out.println(idCN);
            boolean result = test(idCN);
            if (result) {
                System.out.println("你的身份证验证正确!");
            } else {
                System.out.println("你的身份证错误!");
            }
        }
    }

    private static boolean test(String idCN) {


        if(idCN.length() != 18 || idCN.charAt(0) == '0'){
            return false;
        }

        char endCh = idCN.charAt(idCN.length() - 1);
        if (endCh < '0' || endCh > '9' && endCh != 'X') {
            return false;
        }

        boolean flag = true;

        for (int i = 0; i < idCN.length() - 1; i++) {
            char c = idCN.charAt(i);
            if(c < '0' || c > '9'){
                flag = false;
            }
        }

        return flag;
    }
}
