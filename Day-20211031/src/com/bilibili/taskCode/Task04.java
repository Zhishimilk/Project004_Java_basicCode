package com.bilibili.taskCode;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
//        第四题: 分析以下需求,并用代码实现
//        提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
//        遍历字符串分别筛选出数字和字母把它们分别拼接成字符串（如有符号不包含在字母里），
//        按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。
//
//        例如：
//        请输入一个字符串（必须包含数字和字母）：
//        sd$15w32AD%..fv9!
//                新的字符串为：1532sdwADfv

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >='A' && c <= 'C')){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
