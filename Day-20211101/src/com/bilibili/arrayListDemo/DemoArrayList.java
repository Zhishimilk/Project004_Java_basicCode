package com.bilibili.arrayListDemo;

import com.bilibili.doMain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<>();

        sList.add("2233");
        sList.add("world");
        sList.add(1, "helle");
        sList.add(".");

        System.out.println(sList);

        System.out.println(sList.remove("2233"));
        System.out.println(sList);

        System.out.println(sList.set(0, "hello"));
        System.out.println(sList);

        System.out.println(sList.remove(sList.size() - 1));
        System.out.println(sList);

        for (int i = 0; i < sList.size(); i++) {
            String s = sList.get(i);
            System.out.println(s);
        }

        for (int i = sList.size() - 1; i >= 0; i--) {
            String s = sList.get(i);
            if(s.equals("world")){
                sList.remove(i);
            }
        }
        System.out.println(sList);

        Student stu1 = new Student("马尔扎哈", 37);
        Student stu2 = new Student("古力娜扎", 33);
        Student stu3 = new Student("迪丽热巴", 31);

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生信息");
            stuList.add(getStu());
        }

        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
    }

    public static Student getStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名:");
        String name = sc.nextLine();
        System.out.println("输入年龄:");
        int age = sc.nextInt();
        Student stu = new Student(name, age);
        return stu;
    }
}
