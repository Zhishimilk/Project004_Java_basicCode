package com.bilibili.partOfClass;

public class Manager {
//    第6题：分析以下需求，并用代码实现
//	1.项目经理类Manager
//    属性：
//              姓名name
//              工号id
//              工资salary
//              奖金bonus
//    行为：
//              工作work()
//              要求:
//     1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
//		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
//		3.调用成员方法,打印格式如下:
//    工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....

    private String name;
    private int id;
    private double salary;
    private double bonus;

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Manager() {
    }
}
