package com.bilibili.fileWriter;

public class Singer {

    private String name;
    private int Age;
    private String like;

    public Singer() {
    }

    public Singer(String name, int age, String like) {
        this.name = name;
        Age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
