package com.bilibili.fileWriter;

import java.io.File;
import java.io.FileFilter;
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

        //实现 FileFilter 普通写法:
//        File[] files = f1.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".pdf");
//            }
//        });

        //实现 FileFilter lambda表达式写法:
        File[] files = f1.listFiles((pathname) -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".pdf"));

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
            if(files[i].isDirectory()){
                showAllFile(files[i]);
            }
        }
    }
}
