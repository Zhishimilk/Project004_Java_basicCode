package com.bilibili.fileWriter;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {

        //四个歌手实例
        Singer sg1 = new Singer("刘德华", 25, "打篮球");
        Singer sg2 = new Singer("张学友" ,35, "游泳");
        Singer sg3 = new Singer("郭富城" ,19, "踢足球");
        Singer sg4 = new Singer("黎明" ,18, "击剑");

        //将歌手添加进ArrayList集合 singers 中
        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(sg1);
        singers.add(sg2);
        singers.add(sg3);
        singers.add(sg4);

        //修改和删除
        for (int i = singers.size() - 1; i >= 0; i--) {
            Singer sg = singers.get(i);
            if(sg.getAge() > 30){
                sg.setLike("打保龄球");
            }else if(sg.getAge() < 20){
                singers.remove(sg);
            }
        }

        //打印修改后的集合
        pForm(singers);
    }

    private static void pForm(ArrayList<Singer> singers) {
        for (int i = 0; i < singers.size(); i++) {
            Singer sg = singers.get(i);
            System.out.println(sg.getName() + ", " + sg.getAge() + ", " + sg.getLike());
        }
    }
}
