package com.bilibili.partOfClass;

public class Cat {
//    1.猫类Cat
//        属性:
//                  毛的颜色color
//                  品种breed
//        行为:
//                  吃饭eat()
//                  抓老鼠catchMouse()
//        要求:
//        1.按照以上要求定义Cat类和Dog类,属性要私有，setter和getter方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示方法:setter方法)
//        3.调用成员方法,打印格式如下:
//        花色的波斯猫正在吃鱼.....
//        花色的波斯猫正在逮老鼠....

    private String color;
    private String breed;

    public void eat(){
        System.out.println(this.color+"的"+this.breed+"正在吃鱼.....");
    }

    public void catchMouse(){
        System.out.println(this.color+"的"+this.breed+"正在逮老鼠.....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
