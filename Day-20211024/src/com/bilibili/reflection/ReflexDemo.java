package com.bilibili.reflection;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflexDemo {
    public static void main(String[] args) throws Exception {

//        //获取Class对象 no.1
//        Student psn = new Student();
//        Class<? extends Student> aClass = psn.getClass();
//
//        Class<?> sClass = aClass.getSuperclass();
//        System.out.println(sClass.getName());
//
//        Class<?>[] itfClassArr = aClass.getInterfaces();
//        for (Class<?> itfClass : itfClassArr) {
//            System.out.println(itfClass.getName());
//        }
//
//        //获取Class对象 no.2
//        try {
//            Class<?> aClass1 = Class.forName("com.bilibili.reflection.Student");
//
//            Class<?> sClass1 = aClass1.getSuperclass();
//            System.out.println(sClass1.getName());
//
//            Class<?>[] itfClassArr1 = aClass1.getInterfaces();
//            for (Class<?> itfClass : itfClassArr1) {
//                System.out.println(itfClass.getName());
//            }
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        //获取Class对象 no.3
//        ClassLoader classLoader = Reflex.class.getClassLoader();
//        try {
//            Class<?> aClass2 = classLoader.loadClass("com.bilibili.reflection.Student");
//
//            Class<?> sClass2 = aClass.getSuperclass();
//            System.out.println(sClass2.getName());
//
//            Class<?>[] itfClassArr2 = aClass2.getInterfaces();
//            for (Class<?> itfClass : itfClassArr2) {
//                System.out.println(itfClass.getName());
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        //获取Class对象 no.4
//        Class<Student> aClass3 = Student.class;
//
//        //获取父类对象
//        Class<?> sClass3 = aClass3.getSuperclass();
//        System.out.println(sClass3.getName());
//
//        //获取类的接口
//        Class<?>[] itfClassArr3 = aClass3.getInterfaces();
//        for (Class<?> itfClass : itfClassArr3) {
//            System.out.println(itfClass.getName());
//        }
//
//        //获取类所有构造方法, 包括私有构造方法
//        Constructor<?>[] dConstructors = aClass3.getDeclaredConstructors();
//        for (Constructor<?> dConstructor : dConstructors) {
//            System.out.println(dConstructor.getName() + dConstructor.getModifiers());
//        }
//
//        Field name = aClass3.getDeclaredField("name");
//        //忽略访问修饰符的安全检查
//        name.setAccessible(true);
//
//        Student sdt = new Student();
//        name.set(sdt, "刘斩仙");
//        Object value = name.get(sdt);
//        System.out.println(value);
//        Student student = aClass3.getDeclaredConstructor().newInstance();
//        Constructor<Student> adc = aClass3.getDeclaredConstructor();
//        Student student1 = adc.newInstance();
//
//        Person person = new Person();


        //加载类加载器
        ClassLoader cld = ReflexDemo.class.getClassLoader();
        //获取数据输入流
        InputStream ras = cld.getResourceAsStream("pro.properties");
        //创建与输入输出流相关的Map子类Properties的对象集合
        Properties pro = new Properties();
        //从输入字节流中读取属性列表
        pro.load(ras);

        //获取对应键值对 key的value
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //获取对应的Class类对象
        Class<?> aClass = Class.forName(className);
        //使用类对象的构造方法创建该类的实例
        Object o = aClass.getDeclaredConstructor().newInstance();
        //使用类对象获取成员方法的对象
        Method method = aClass.getMethod(methodName);
        //使用method对象的invoke方法并传入具体的对象来执行方法
        method.invoke(o);
        //关闭使用的系统资源
        ras.close();
    }
}
