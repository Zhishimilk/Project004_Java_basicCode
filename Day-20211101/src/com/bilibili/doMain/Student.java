package com.bilibili.doMain;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student getMaxScore(ArrayList<Student> list){
        Student earnestStu = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getScore() > earnestStu.getScore()){
                earnestStu = stu;
            }
        }

        return earnestStu;
    }

    public double sumScore(ArrayList<Student> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }

        return sum;
    }

    public double avgScore(ArrayList<Student> list){
        return sumScore(list)/list.size();
    }

    public ArrayList<Student> printLostStu(ArrayList<Student> list){
        int count = 0;
        ArrayList<Student> stuList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getScore() < 6){
                stuList.add(list.get(i));
                count++;
            }
        }
        return stuList;
    }
}
