package com.bilibili.fileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_ {
    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream(new File("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        FileInputStream fis = new FileInputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt");

//        int read()
//        System.out.println(fis.read());

//        循环读取一个字节
//        int len = 0;
//        while((len = fis.read()) != -1){
//            System.out.println(len);
//        }

//        int read(byte[] b)
        byte[] bt1 = new byte[1024];
        int len = fis.read(bt1);
        System.out.println(len);
        System.out.println(new String(bt1, 0, len));

        fis.close();
    }
}
