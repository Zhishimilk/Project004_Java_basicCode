package com.bilibili.twoArray;

public class TwoArrayDemo {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//        }
//
//        int[][] arr1 = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
//        int sum = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                sum += arr1[i][j];
//            }
//        }
//        System.out.println(sum);

//        for (int i = 9; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                    System.out.print(j+"*"+i+"="+ i*j +"\t");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.print(i+"小时"+j+"分钟"+ "\t");
                if(j%10==9 && j!=0){
                    System.out.println();
                }
            }
        }
    }
}
