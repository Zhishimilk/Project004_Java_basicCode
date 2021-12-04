package com.bilibili.interviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("按照 {活动时间 yyyy-MM-dd HH:mm~HH:mm ⼈数} 的格式依次输入每次活动的详情, 或者输入 'q' 结束输入");

        //定义三个集合分别储存日历，时间，人数
        ArrayList<String> calendars = new ArrayList<>();    //储存日历
        ArrayList<String> timeHours = new ArrayList<>();    //储存时间
        ArrayList<Integer> peoples = new ArrayList<>();     //储存人数

        //循环录入数据
        while(true){
//            System.out.println("请输入, 或者输入 'q' 结束 :");

            //记录用户录入的第一个字符串进行判断来决定是否结束录入
            String s = sc.next();
            if(s.equals("q")){
                break;
            }

            //将字段加入对应的集合
            calendars.add(s);   //日期
            timeHours.add(sc.next());   //时间段
            peoples.add(sc.nextInt());  //人数
        }

        //记录工作日场地每个阶段的收费
        int[] weekdaysPrice = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30, 30, 40, 40, 40, 40, 40, 40, 80, 80, 60, 60, 0};
        //记录休息日场地每个阶段的收费
        int[] restDayPrice = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 40, 40, 50, 50, 50, 50, 50, 50, 60, 60, 60, 60, 0};

        //存储计算后的每条表单信息
        ArrayList<String> forms = new ArrayList<>();
        //记录总支出和总收入 paymentSum/incomeSum
        int paymentSum = 0, incomeSum = 0;

        //录入每条详细信息
        for (int i = 0; i < calendars.size(); i++) {

            String calender = calendars.get(i);     //第 i 个的日期
            String duration = timeHours.get(i);     //第 i 个的时间段
            int people = peoples.get(i);     //第 i 个的人数

            int fields = fieldNums(people);     //场地数量
            int week = dayOfWeek(calender);     //星期数
//            System.out.println(week);

            int payment = Payment(week, weekdaysPrice, restDayPrice, fields, duration);     //当天支出
            paymentSum += payment;      //当前总支出
            int income = income(people, fields);    //当天收入
            incomeSum += income;        //当前总收入

            //将对应结果的表单按格式拼接并添加到forms集合中
            if(income > payment){
                forms.add(calender +"  "+ duration + "  +" + income + "  -" + payment + "  +" + (income - payment));
            }else {
                forms.add(calender +"  "+ duration + "  +" + income + "  -" + payment + "  " + (income - payment));   // +"  week: "+week + "  fields: " + fields
            }
        }

        //打印结果表单
        printForm(forms, incomeSum, paymentSum);

        //----------------------------------------------
        sc.close();
    }

    //一个获取指定日期的星期数的方法
    public static int dayOfWeek(String calendar){
        //储存星期数
        int week = 0;
        //Calendar来获取对应字段的星期数
        Calendar cld = Calendar.getInstance();
        //获取对应格式的date日期，并获取对应字段的星期数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(calendar);
            cld.setTime(date);
            week = cld.get(Calendar.DAY_OF_WEEK);
        } catch (ParseException e) {
            System.out.println("你录入的数据有误!");
            e.printStackTrace();
        }

        return week;
    }
    //一个获取在一天几点的方法
    public static int time(String time){
        //储存时间
        int  timeOfDay = 0;
        //Calendar来获取对应字段的时间
        Calendar cld = Calendar.getInstance();
        //获取对应格式的date日期，并获取对应字段的时间
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date date = sdf.parse(time);
            cld.setTime(date);
            timeOfDay = cld.get(Calendar.HOUR_OF_DAY);
        } catch (ParseException e) {
            System.out.println("你录入的数据有误!");
            e.printStackTrace();
        }

        return timeOfDay;
    }
    //一个计算需要租用场地数量的方法
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
    //一个计算当日总支出的方法
    public static int Payment(int week, int[] weekdaysPrice, int[] restDayPrice, int fieldNum,  String duration){
        //记录总支出
        int sumPrice = 0;

        if(fieldNum > 0) {
            //star和end记录开始时间和结束时间
            String[] dur = duration.split("~");
            int star = time(dur[0]);
            int end = time(dur[1]);

            //判断当天是休息日还是工作日并计算开始到结束的总支出
            if (week == 7 || week == 1) {
                while (star++ < end) {
                    sumPrice += restDayPrice[star] * fieldNum;
                }
            } else {
                while (star++ < end) {
                    sumPrice += weekdaysPrice[star] * fieldNum;
                }
            }
        }

        return sumPrice;
    }
    //一个计算当日总收入的方法
    public static int income(int people, int field){
        int incomeSum = 0;
        if(field > 0)
            incomeSum = people * 30;
        return incomeSum;
    }
    //一个打印表单的方法
    public static void printForm(ArrayList<String> list, int incomeSum, int paymentSum){
        System.out.println("[Summary]");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Total Income:  "+ incomeSum);
        System.out.println("Total Payment:  "+ paymentSum);
        System.out.println("Profit:  "+ (incomeSum - paymentSum));
    }
}
