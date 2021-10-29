package com.bilibili.interviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        Calendar.getInstance();
//        System.out.println(c);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
//        try {
//            Date date = sdf.parse("20:00");
//            c.setTime(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        int i = c.get(Calendar.HOUR_OF_DAY);
//        System.out.println(i);


        Scanner sc = new Scanner(System.in);
//        System.out.println("按照 {活动时间 yyyy-MM-dd HH:mm~HH:mm ⼈数} 的格式依次输入每次活动的详情, 或者输入 'q' 结束输入");
//
//        //定义三个集合分别储存日历，时间，人数
//        ArrayList<String> calendars = new ArrayList<>();    //储存日历
//        ArrayList<String> timeHours = new ArrayList<>();    //储存时间
//        ArrayList<Integer> peoples = new ArrayList<>();     //储存人数
//
//        //循环录入数据
//        while(true){
//            System.out.println("请输入, 或者输入 'q' 结束 :");
//
//            //记录用户录入的第一个字符串进行判断来决定是否结束录入
//            String s = sc.next();
//            if(s.equals("q")){
//                break;
//            }
//
//            //将字段加入对应的集合
//            calendars.add(s);
//            timeHours.add(sc.next());
//            peoples.add(sc.nextInt());
//        }

//        System.out.println(calendars);
//        System.out.println(timeHours);
//        System.out.println(peoples);

        System.out.println(fieldNums(20));

        //----------------------------------------------
        sc.close();
    }

    //创建一个计算需要租用场地数量的方法
    public static int fieldNums(int people){
        // 记参加⼀次活动的总⼈数为M
        int M = people;
        // 记T为可以⽴即确定的场地数，其值为M/6（整除）。例如M为6⼈，则T为1；M为5，则T为0
        int T = M/6;
        // 记X为多出来的⼈，其值为M%6（求模）。⽐如M为6，则X为0；M为8，则X为2(提醒：按求模的定义，X的值⼩于6)。
        int X = M%6;
        //定义field记录场地数量
        int fields = T;

        //按照给定策略进行场地安排（给fields赋值）
        if(T==0 && X<4){
            fields = 0;
        }else if(T==0 && X>=4){
            fields = 1;
        }else if(T==1){
            fields = 2;
        }else if((T==2 || T==3) && X>=4){
            fields = T+1;
        }else if(T > 3){
            fields = T;
        }

        return fields;
    }
    //创建一个计算当日总支出的方法
    //创建一个计算当日总收入的方法
}
