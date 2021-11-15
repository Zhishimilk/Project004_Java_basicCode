package com.bilibili.fileWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTask {
    public static void main(String[] args) throws IOException {
        //读取与写入
        FileInputStream fis = new FileInputStream("C:\\Users\\zhish\\Desktop\\temp\\Arista.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\zhish\\Desktop\\temp\\YoumuKonpaku.rar", true);

        byte[] bt = new byte[1024];
        int len = 0;

        while ((len = fis.read(bt)) != -1){
            fos.write(bt, 0, len);
        }

        fos.close();
        fis.close();
    }
}
