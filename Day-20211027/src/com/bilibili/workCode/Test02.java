package com.bilibili.workCode;

public class Test02 {
    public static void main(String[] args) {
//        第3题、分析以下需求，并用代码实现：
//        有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。
//        第一分钟灌水的速度是1L/min，第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，
//        以此类推。而流水的速度固定是3L/min。那么几分钟之后，水桶里能保持灌满水的状态？
//        最后通过debug查看程序的执行流程，验证代码是否编写正确。

        //定义一个桶以及流量和出量, 和计时器
        int bucket = 0, input = 0, output = 3, time = 0;
        //当桶内不满10L时, 继续循环加水
        while(bucket < 10){
            //计时器加1
            time++;
            //流量加1
            input++;
            //超过出量的水加入桶中
            if(input > output){
                bucket += input - output;
            }
        }
        //打印所需时间
        System.out.println("一共需要: "+time+"分钟");
    }
}
