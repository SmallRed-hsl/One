package ShuZhu;

import java.util.Arrays;
import java.util.Scanner;

public class Dome7 {
    public static void main(String[] args) {
//        输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)
        String[] name =new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入"+(i+1)+"水果的名字");
             name[i] = new Scanner(System.in).next();
        }
        Arrays.sort(name);
        for (String a:name) {
            System.out.println(a);
        }
    }
}
