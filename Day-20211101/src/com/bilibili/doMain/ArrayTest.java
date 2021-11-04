package com.bilibili.doMain;

import java.util.ArrayList;

public class ArrayTest {


    public  void reverse(ArrayList list){
        for (int start=0, end=list.size()-1; start<end; start++, end--){
//            Object temp = list.get(start);
//            list.set(start, list.get(end));
//            list.set(end, temp);

            Object o = list.set(start, list.get(end));
            list.set(end, o);

        }
    }

    public int indexOf(ArrayList list,Object s){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(s)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void replaceAll(ArrayList list,Object oldValue,Object newValue){
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).equals(oldValue)){
               list.set(i, newValue);
           }
        }
    }
}
