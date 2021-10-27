package com.bilibili.reflection;

public class Student extends Person implements Eat, Motion{

    String school;
    private String name = "王诛魔";

    public Student() {
    }

    private Student(String school) {
        this.school = school;
    }

    public void showInformation(){
        System.out.println("学校:" + this.school);
    }

    @Override
    public void eat() {
        System.out.println("麻婆豆腐");
    }

    @Override
    public void moveMode() {
        System.out.println("篮球");
    }
}
