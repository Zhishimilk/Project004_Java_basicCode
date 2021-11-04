package com.bilibili.taskCode;

import com.bilibili.doMain.ArrayTest;
import com.bilibili.doMain.Student;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
//        第二题：分析以下需求，并用代码实现
//        定义一个ArrayTest类，该类中有以下方法，方法描述如下：
//        1.	public static void reverse(ArrayList<String> list);
//        参数ArrayList<String> list:要进行操作的集合对象
//        要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
//        2.	public static int indexOf(ArrayList<String> list,String i);
//        参数ArrayList<String> list:要进行操作的集合对象
//        参数String i:需要在集合中查找的元素
//        要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
//        3.	public static void replaceAll(ArrayList<String> list,String oldValue,String newValue);
//        参数ArrayList<String> list:要进行操作的集合对象
//        参数String oldValue:需要被替换掉的原值
//        参数String newValue：替换后的新值
//        要求：将list集合中的所有值为oldValue的元素替换为newValue
//
//        最后在主方法中分别调用这些方法。

        ArrayTest at = new ArrayTest();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(6);
        intList.add(6);
        intList.add(7);

        System.out.println(intList);
        at.reverse(intList);
        System.out.println(intList);
        System.out.println("------------------------------------");

        int index = at.indexOf(intList, 5);
        System.out.println("index "+index+ " of "+intList.get(index) );
        System.out.println("------------------------------------");

        at.replaceAll(intList, 6, 666);
        System.out.println(intList);

    }
}
