package com.bilibili.workCode;

public class Test03 {
    public static void main(String[] args) {
//        第4题、分析以下需求，并用代码实现：
//        主方法中给定数组int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.
//                定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值

        int[] arr= {10,20,30,60,40,50};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr){

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[index]){
                index = i;
            }
        }
        return index;
    }
}
