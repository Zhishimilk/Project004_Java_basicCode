package com.bilibili.taskCode;

import com.bilibili.doMain.Student;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
//        第三题: 分析以下需求,并用代码实现
//        1.	定义Student类
//        属性:
//        姓名：String name
//        年龄：int age
//        成绩：int score
//        行为:
//        空参构造方法
//                有参构造方法
//        set和get方法
//                toString方法
//        2.	定义测试类,进行测试
//                (1)创建10个学生对象存入ArrayList集合中
//                (2)打印最高分的学员姓名、年龄、成绩  [要求封装1个方法  参数是集合对象   返回值类型为Student]
//        (3)打印10个学生的总成绩和平均分		 [要求封装两个方法完成]
//        (4)打印不及格的学员信息及数量		 [要求封装一个方法完成]

        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student();
        for (int i = 0; i < 10; i++) {
            Student stu = new Student("张" + i, i + 10, i);
            stuList.add(stu);
        }
        System.out.println(stuList);
        System.out.println(stu1.getMaxScore(stuList));
        System.out.println(stu1.sumScore(stuList));
        System.out.println(stu1.avgScore(stuList));
        System.out.println(stu1.printLostStu(stuList));
    }
}
