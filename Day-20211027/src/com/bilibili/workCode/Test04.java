package com.bilibili.workCode;

import javax.crypto.spec.PSource;

public class Test04 {
    public static void main(String[] args) {
//        第5题、分析以下需求，并用代码实现：
//        定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,
//                并同时把这个四个结果返回(把四个数放入到一个数组中并返回)

        int[] result = allResult(22, 36);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] allResult(int a, int b){

        int[] result = {a+b, a-b, a*b, a/b};
        return result;
    }
}
