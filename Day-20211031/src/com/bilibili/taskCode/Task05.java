package com.bilibili.taskCode;

import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
//        第五题: 分析以下需求,并用代码实现
//        在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
//        验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
//        在判断验证码时一般不区分大小写。
//        请编写程序模拟验证码的判断过程，如果输入正确，给出提示，结束程序。
//        如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
//
//        定义一个方法，完成生成4位随机验证码的功能，要求每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。
//
//        运行效果如下：
//        生成的验证码为：BkhD
//                请输入验证码
//        abcd
//        输入错误，请重新输入...
//        生成的验证码为：n1wX
//                请输入验证码
//        aaaa
//        输入错误，请重新输入...
//        生成的验证码为：Fm1a
//                请输入验证码
//        fm1a
//                输入正确

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',};
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[rd.nextInt(arr.length)]).append(arr[rd.nextInt(arr.length)]).append(arr[rd.nextInt(arr.length)]).append(arr[rd.nextInt(arr.length)]);
            String s = sb.toString();
            System.out.println("生成验证码: "+s);
            System.out.println("请输入验证: ");
            String s1 = sc.nextLine();
            if (s1.equalsIgnoreCase(s)) {
                System.out.println("验证成功!");
                break;
            } else {
                System.out.print("验证失败, 请重新输入, ");
            }
        }
    }
}
