package com.bilibili.partOfClass;

public class Book {
//	（1）设计“图书类”Book，要求有以下属性：
//        图书编号:  String  id
//        书名：String name
//        价格：double price
//        私有属性 提供setter、getter方法

    private String id;
    private String name;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
