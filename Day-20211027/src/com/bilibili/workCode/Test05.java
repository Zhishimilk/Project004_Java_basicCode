package com.bilibili.workCode;

public class Test05 {
    public static void main(String[] args) {
//        第6题、分析以下需求，并用代码实现：
//        (1)定义一个int类型的数组，内容为{6,2,9,15,1,5,20,7,18}
//        (2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组
//        提示思路：先查找最大值和最小值出现的索引，
//        注：求最值、交换和打印数组分别定义到各自的方法中
        
        int[] arr = {6,2,9,15,1,5,20,7,18};
        int max = 0, min = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }else if(arr[i] < arr[min]){
                min = i;
            }
        }
        
        int end = arr.length - 1;
        arr[max] = arr[max] ^ arr[end];
        arr[end] = arr[max] ^ arr[end];
        arr[max] = arr[max] ^ arr[end];
        arr[min] = arr[min] ^ arr[0];
        arr[0] = arr[min] ^ arr[0];
        arr[min] = arr[min] ^ arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
