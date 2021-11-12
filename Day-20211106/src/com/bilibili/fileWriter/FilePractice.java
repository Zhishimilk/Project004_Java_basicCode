package com.bilibili.fileWriter;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("C:\\Users\\zhish\\Desktop\\a.txt", true);
//        fw.write("Hello World!");
//        fw.close();

//        FileReader fr = new FileReader("C:\\Users\\zhish\\Desktop\\a.txt");
//        int c;
//        while((c = fr.read()) != -1){
//            System.out.print((char)c);
//        }
//        fr.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp.txt"));
//        bw.write("abc");
//        bw.close();

        File f1 = new File("G:\\DownLoad\\Web");
        showAllFile(f1);
    }

    private static void showAllFile(File f1) {
        File[] files = f1.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
            if(files[i].isDirectory()){
                showAllFile(files[i]);
            }
        }
    }

}
