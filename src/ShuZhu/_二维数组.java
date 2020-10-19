package ShuZhu;

import java.util.Arrays;
import java.util.Scanner;

public class _二维数组 {
    public static void main(String[] args) {
//        、使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
        Scanner input =new Scanner(System.in);

        int[][] a =new int[1][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.println("请输入第"+(i+1)+"学生，第"+(j+1)+"门成绩:");
                a[i][j]=input.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            int num = 0;
            double age = 0;
            int small = a[i][0] ;
            int max = a[i][0] ;
            for (int j = 0; j < a[i].length; j++) {
                num+=a[i][j];
                if(a[i][j]<small){
                    small=a[i][j];
                }
                if (a[i][j]>max){
                    max =a[i][j];
                }
            }
            age=(double)num/a[i].length;

            System.out.println("第"+(i+1)+"学生的总分"+a[i].length+"："+num+" 平均分:"+String.format("%.1f", age)+"最低分："+small+"最高分："+max);
        }
    }
}
