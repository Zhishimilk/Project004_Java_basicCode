package com.bilibili.partOfClass;

public class Teacher {
    //        第7题：分析以下需求，并用代码实现
//	（1）有以下数据：
//        1.	三个老师（Teacher）信息：
//        教师编号	姓名	性别	年龄

//	（2）请分别定义两个类描述老师和科目；
//	（3）创建一个测试类MainApp，类中包含main()方法，创建两个类的对象，通过构造方法给成员变量赋值。
//	（4）打印每个对象的所有属性。
//        要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。

    private String id;
    private String name;
    private String sex;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher() {
    }

    public Teacher(String id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
