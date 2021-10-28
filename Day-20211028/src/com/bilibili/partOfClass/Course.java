package com.bilibili.partOfClass;

public class Course {

//    第7题：分析以下需求，并用代码实现
//	（1）有以下数据：
//            2.	存储两个科目（Course）信息：
//                  课程编号		名称	创建时间	课程描述
//                  s001			Java	2007-02-08	Java学科，包含JavaSE和JavaEE
//                  s002			IOS		2007-02-09	IOS系统开发
//	（2）请分别定义两个类描述老师和科目；
//            （3）创建一个测试类MainApp，类中包含main()方法，创建两个类的对象，通过构造方法给成员变量赋值。
//            （4）打印每个对象的所有属性。
//    要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。

    private String id;
    private String name;
    private String creatTime;
    private String details;

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

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

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Course(String id, String name, String creatTime, String details) {
        this.id = id;
        this.name = name;
        this.creatTime = creatTime;
        this.details = details;
    }

    public Course() {
    }
}
