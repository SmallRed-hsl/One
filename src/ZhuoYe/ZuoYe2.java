package ZhuoYe;

import java.util.Scanner;

public class ZuoYe2 {
    public static void main(String[] args) {
//        2、使用for循环结构实现：从键盘上接收从周一至周五每天的学习时间（以小时为单位），并计算每日平均学习时间。输出结果如图所示。
//        控制台：
//        请输入周1的学习时间：8
//        请输入周2的学习时间：9
//        请输入周3的学习时间：7
//        请输入周4的学习时间：10
//        请输入周5的学习时间：8
//        周一~周5学习平均为：8.4小时！
        double num = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入周"+i+"的学习时间：");
            num += new Scanner(System.in).nextDouble();
        }
        System.out.println("周一~周5学习平均为："+num/5+"小时！");

    }
}
