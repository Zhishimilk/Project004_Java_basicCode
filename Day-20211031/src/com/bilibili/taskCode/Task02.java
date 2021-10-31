package com.bilibili.taskCode;

public class Task02 {
    public static void main(String[] args) {
//        第二题：分析以下需求，并用代码实现
//        现有如下文本：
//        "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
//        请编写程序，统计该文本中"Java"一词出现的次数。

        String s = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        s = "a"+"Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"+"a";
        String[] javas = s.split("Java");
        System.out.println("java单词的个数为: "+ (javas.length-1));

    }
}
