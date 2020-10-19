package ShuZhu;

import java.util.Scanner;

public class _二维数组3 {
    public static void main(String[] args) {
//        java定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩
//        定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩；这5门课
//        按存储顺序依次为：Java，JSP，CoreJava，MySQL和HTML5。
//（1）循环给二维数组的每一个元素赋0~100之间的随机整数。 (int) (Math.random() * 100)
//（2）按照列表的方式输出这些学员的每门课程的成绩。
//（3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
//（4）要求编写程序求所有学员的某门课程的平均分
        Scanner input =new Scanner(System.in);
        int[][] stu =new int[3][5];
        int[] nums =new int[stu.length];
        double num = 0;

        for (int i = 0; i < stu.length; i++) {

            System.out.println("\nJava\tJSP\t CoreJava\tMySQL\tHTML5");
            for (int j = 0; j < stu[i].length; j++) {
                stu[i][j]=(int)(Math.random()*100);
                nums[i]+=stu[i][j];
                System.out.print(stu[i][j]+"\t\t");

            }

        }
        System.out.println();
        int a = input.nextInt();

        a=a-1;
        for (int i = 0; i < stu.length; i++) {

            num += stu[i][a];

        }
        System.out.println("平均分："+String.format("%.1f", num/stu.length));

    }
}
