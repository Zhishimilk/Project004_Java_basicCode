package com.bilibili.fileWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream_ {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt", true);
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"), true);
//        void write(int b)
        fos.write(98);

//        void write(byte[] b)
        byte[] bt1 = {22, 33, 66, 77, 88};
        fos.write(bt1);

//        void write(byte[] b, int off, int len)
        fos.write(bt1, 2, 3);

//         \r\n 换行(windows)
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
//        byte[] getBytes()
        byte[] bt2 = "你好, 世界".getBytes(StandardCharsets.UTF_8);
        fos.write(bt2);

        fos.close();
    }
}
