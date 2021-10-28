package com.bilibili.partOfClass;

public class Student {
//    第4题：分析以下需求，并用代码实现
//	（1）设计，并定义一个学员类：Student，要求有以下属性：
//    学员编号（String）
//    姓名（String）
//    性别（String）
//    身高（double）
//    年龄（int）
//            （2）使用封装的原则，并提供无参和全参的构造方法。
//            ?	定义测试类MainApp，并包含main()方法。
//            ?	程序启动后，应分别提示用户输入学员编号、姓名等信息。
//    例如控制台显示：
//    C:\>请输入学员编号：
//    C:\>....
//    C:\>请输入学员姓名：
//    C:\>....
//            .................
//            （3）数据接收到程序中，并定义局部变量存储；
//            （4）创建Student对象，通过构造方法将所有数据存储到Student对象中；
//            （5）打印对象中的每个属性值。

    private String id;
    private String name;
    private String sex;
    private double height;
    private int age;

    public Student() {
    }

    public Student(String id, String name, String sex, double height, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public void study(){
        System.out.println("study");
    }

    public void eat(){};
}
