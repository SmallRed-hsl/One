package ZhuoYe;

import java.util.Scanner;

public class ZouYe171 {
    //    1、输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分。
    public static void main(String[] args) {
        System.out.println("请输入第3各班！");
        for (int i = 1; i <= 3; i++) {
            int num = 0;
            int max = 0;
            int min = 0;
            int Gon = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第"+i+"个班，第"+j+"个学生的成绩：");
                num = new Scanner(System.in).nextInt();
                Gon+=num;
                if(num>max){
                    max = num;
                }
                if(num<max){
                    min = num;
                }

            }
            System.out.println(i+"班的总分是："+Gon+"平均分是："+(Gon/5)+"最高分是："+max+"最低分是:"+min);
        }
    }
}
