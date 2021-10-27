package com.bilibili.reflection;

public class Person implements Eat{
    public String name;
    private String address;
    int age;
    double score;

    public Person() {
    }

    public Person(String name, String address, int age, double score) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
