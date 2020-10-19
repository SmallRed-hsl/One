package ShuZhu;

import java.util.Scanner;

public class _二维数组2 {
    public static void main(String[] args) {
//        、公司年销售额求和
//        某公司按照季度和月份统计的数据如下：单位(万元)
//        第一季度：22,66,44
//        第二季度：77,33,88
//        第三季度：25,45,65
//        第四季度：11,66,99
//        提示：
        Scanner input =new Scanner(System.in);
        int[][] a =new int[4][3];

        for (int i = 0; i < a.length; i++) {
            System.out.print("第"+(i+1)+"季度");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("第"+(j+1)+"销售额：");
                a[i][j] += input.nextInt();
            }

        }
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("第"+(i+1)+"季度\t");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
                num+=a[i][j];
            }
            System.out.println();
        }
        System.out.println(num);

    }
}
