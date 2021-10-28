package com.bilibili.partOfClass;

public class Test {
    public static void main(String[] args) {
//        Phone p = new Phone();
//        p.setBrand("糯米");
//        p.setPrice(2077);
//
//        p.call("father");
//        p.sendMessage(7);
//        System.out.println(p.getBrand());
//        System.out.println(p.getPrice());


//------------------------------------------------------------
//        第2题：分析以下需求并实现
//        1.猫类Cat
//        属性:
//                  毛的颜色color
//                  品种breed
//        行为:
//                  吃饭eat()
//                  抓老鼠catchMouse()

//        2.狗类Dog
//        属性:
//                  毛的颜色color
//                  品种breed
//        行为:
//                  吃饭()
//                  看家lookHome()
//        要求:
//        1.按照以上要求定义Cat类和Dog类,属性要私有，setter和getter方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示方法:setter方法)
//        3.调用成员方法,打印格式如下:
//        花色的波斯猫正在吃鱼.....
//        花色的波斯猫正在逮老鼠....
//        黑色的藏獒正在啃骨头.....
//        黑色的藏獒正在看家.....

//        Cat cat = new Cat();
//        cat.setColor("花色");
//        cat.setBreed("波斯猫");
//        cat.eat();
//        cat.catchMouse();
//        Dog dog = new Dog();
//        dog.setColor("黑色");
//        dog.setBreed("藏獒");
//        dog.eat();
//        dog.lookHome();


//------------------------------------------------------------
//        第3题：分析以下需求，并用代码实现
//	（1）设计“图书类”Book，要求有以下属性：
//        图书编号:  String  id
//        书名：String name
//        价格：double price
//        私有属性 提供setter、getter方法
//	（2） 定义测试类
//        在main方法内，根据以下内容创建并初始化3个Book对象
//        {"b001","java",30}
//        {"b002" ,"c++",40}
//        {"b003","php",20}
//        要求对成员变量进行赋值（初始化），无参构造创建对象，setter方法赋值
//	（3）打印对象中的每个属性值。

//        Book book1 = new Book();
//        Book book2 = new Book();
//        Book book3 = new Book();
//        book1.setId("b001");
//        book1.setName("java");
//        book1.setPrice(30);
//        book2.setId("b002");
//        book2.setName("C++");
//        book2.setPrice(40);
//        book3.setId("b003");
//        book3.setName("php");
//        book3.setPrice(20);
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);


//------------------------------------------------------------
//        第4题：分析以下需求，并用代码实现
//	（1）设计，并定义一个学员类：Student，要求有以下属性：
//        学员编号（String）
//        姓名（String）
//        性别（String）
//        身高（double）
//        年龄（int）
//	（2）使用封装的原则，并提供无参和全参的构造方法。
//		?	定义测试类MainApp，并包含main()方法。
//		?	程序启动后，应分别提示用户输入学员编号、姓名等信息。
//        例如控制台显示：
//        C:\>请输入学员编号：
//        C:\>....
//        C:\>请输入学员姓名：
//        C:\>....
//				.................
//	（3）数据接收到程序中，并定义局部变量存储；
//	（4）创建Student对象，通过构造方法将所有数据存储到Student对象中；
//	（5）打印对象中的每个属性值。

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生编号:");
//        String id = sc.nextLine();
//        System.out.println("请输入学生姓名:");
//        String name = sc.nextLine();
//        System.out.println("请输入学生性别:");
//        String sex = sc.nextLine();
//        System.out.println("请输入学生身高:");
//        double height = sc.nextDouble();
//        System.out.println("请输入学生年龄:");
//        int age = sc.nextInt();
//
//        Student sdt = new Student(id, name, sex, height, age);
//        System.out.println(sdt);


//------------------------------------------------------------
//        第5题：分析以下需求，并用代码实现
//                手机类Phone
//        属性:
//        品牌brand
//                价格price
//        行为:
//        打电话call()
//        发短信sendMessage()
//        玩游戏playGame()
//
//        要求:
//        1.按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
//        3.调用三个成员方法,打印格式如下:
//        正在使用价格为998元的小米品牌的手机打电话....
//        正在使用价格为998元的小米品牌的手机发短信....
//        正在使用价格为998元的小米品牌的手机玩游戏....
//        Phone xm = new Phone("小米", 999);
//        Phone hw = new Phone();
//        hw.setBrand("华为");
//        hw.setPrice(1999);
//        xm.call();
//        xm.sendMessage();
//        xm.playGame();
//        hw.call();
//        hw.sendMessage();
//        hw.playGame();


//------------------------------------------------------------
//        第6题：分析以下需求，并用代码实现
//        1.项目经理类Manager
//        属性：
//        姓名name
//                工号id
//        工资salary
//                奖金bonus
//        行为：
//        工作work()
        
//        2.程序员类Coder
//        属性：
//        姓名name
//                工号id
//        工资salary
//        行为：
//        工作work()
        
//        要求:
//        1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
//        3.调用成员方法,打印格式如下:
//        工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
//        工号为135基本工资为10000的程序员正在努力的写着代码......
//        Manager Zhangsan = new Manager("张三", 233, 15000, 6000);
//        Manager manager = new Manager();
//        manager.setName("李四");
//        manager.setId(234);
//        manager.setSalary(16000);
//        manager.setBonus(8000);
//
//        Coder Wangwu= new Coder("王五", 235, 15000);
//        Coder coder = new Coder();
//        coder.setName("田七");
//        coder.setId(234);
//        coder.setSalary(16000);
//
//        Zhangsan.work();
//        manager.work();
//        Wangwu.work();
//        coder.work();



//------------------------------------------------------------
//        第7题：分析以下需求，并用代码实现
//	（1）有以下数据：
//        1.	三个老师（Teacher）信息：
//        教师编号	姓名	性别	年龄
//        t001		薛之谦	男		26
//        t002		张碧晨	女		24
//        t003		张杰	男		28
//        2.	存储两个科目（Course）信息：
//        课程编号		名称	创建时间	课程描述
//        s001			Java	2007-02-08	Java学科，包含JavaSE和JavaEE
//        s002			IOS		2007-02-09	IOS系统开发
//	（2）请分别定义两个类描述老师和科目；
//	（3）创建一个测试类MainApp，类中包含main()方法，创建两个类的对象，通过构造方法给成员变量赋值。
//	（4）打印每个对象的所有属性。
//        要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。

        Teacher teacher1 = new Teacher("t001", "薛之谦", "男", 26);
        Teacher teacher2 = new Teacher("t002", "张碧晨", "女", 24);
        Teacher teacher3 = new Teacher("t003", "张杰", "男", 28);
        Course course1 = new Course("s001", "Java", "2007-02-08", "Java学科，包含JavaSE和JavaEE");
        Course course2 = new Course("s002", "IOS", "2007-02-09", "IOS系统开发");

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
        System.out.println(course1);
        System.out.println(course2);
    }
}
