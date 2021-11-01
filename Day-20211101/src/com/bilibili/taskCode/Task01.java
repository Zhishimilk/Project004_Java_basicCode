package com.bilibili.taskCode;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
//        第一题: 分析以下需求,并用代码实现
//        定义一个方法boolean myContains(ArrayList<String> al, String s),
//        要求使用该方法判断al集合里面是否包含元素s，包含返回true，否则返回false。

        ArrayList<String> strList = new ArrayList<>();
        strList.add("ab");
        strList.add("bb");
        strList.add("cb");
        strList.add("db");

        boolean result = myContains(strList, "ab");
        System.out.println(strList);
        System.out.println(result);
    }

    public static boolean myContains(ArrayList<String> list, String s){

        boolean result = list.remove(s);
        if(result){
            list.add(s);
        }
        return result;
    }
}
