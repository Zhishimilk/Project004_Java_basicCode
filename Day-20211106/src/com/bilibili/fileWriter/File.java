package com.bilibili.fileWriter;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("C:\\Users\\zhish\\Desktop\\a.txt", true);
//        fw.write("Hello World!");
//
//        fw.close();

//        FileReader fr = new FileReader("C:\\Users\\zhish\\Desktop\\a.txt");
//
//        int c;
//        while((c = fr.read()) != -1){
//            System.out.print((char)c);
//        }
//        fr.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp.txt"));
        bw.write("abc");

        bw.close();
    }
}
