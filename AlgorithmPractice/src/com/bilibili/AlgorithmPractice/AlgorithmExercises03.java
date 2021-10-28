package com.bilibili.AlgorithmPractice;

import java.lang.reflect.Array;

public class AlgorithmExercises03 {
    public static void main(String[] args) {
/*     题目描述
        将一个字符串中的空格替换成 "%20"。
        Input:
        "A B"
        Output:
        "A%20B"*/

//        解题思路
//          ① 在字符串尾部填充任意字符，使得字符串的长度等于替换之后的长度。因为一个空格要替换成三个字符（%20），所以当遍历到一个空格时，需要在尾部填充两个任意字符。
//          ② 令 P1 指向字符串原来的末尾位置，P2 指向字符串现在的末尾位置。P1 和 P2 从后向前遍历，当 P1 遍历到一个空格时，就需要令 P2 指向的位置依次填充 02%（注意是逆序的），
//               否则就填充上 P1 指向字符的值。从后向前遍是为了在改变 P2 所指向的内容时，不会影响到 P1 遍历原来字符串的内容。
//          ③ 当 P2 遇到 P1 时（P2 <= P1），或者遍历结束（P1 < 0），退出。
        replaceSpace1("AA BBB CCCC DDDDD ");
        System.out.println();
        StringBuffer sbf = new StringBuffer();
        sbf.append("AA BBB CCCC DDDDD ");
        System.out.println(replaceSpace(sbf));
    }

    //我的解决方案
    public static void replaceSpace1(String str) {
        String[] sArr = str.split("");
        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i].equals(" ")){
                str+="xx";
            }
        }
        String[] sArr2 = str.split("");
        int p1 = sArr.length-1, p2 = sArr2.length-1;
        while(p1<p2 && p1>=0){
            if(sArr2[p1].equals(" ")){
                sArr2[p2--] = "0";
                sArr2[p2--] = "2";
                sArr2[p2--] = "%";
                p1--;
            }else{
                sArr2[p2--] = sArr2[p1--];
            }
        }

        for (int i = 0; i < sArr2.length; i++) {
            System.out.print(sArr2[i]);
        }
    }
    //标准答案
    public static String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++)
            if (str.charAt(i) == ' ')
                str.append("  ");

        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }
}
