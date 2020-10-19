package ShuZhu;

import java.util.Scanner;

public class Dome1 {
    public static void main(String[] age){
//        1. 使用冒泡排序对输入的5名学员成绩进行降序排列
        int[] num = new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入五个学生成绩：");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if(num[j]<num[j+1]){
                   int tamp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tamp;
                }
            }
        }
        for (int a:num) {
            System.out.print("  "+a);
        }

    }
}
