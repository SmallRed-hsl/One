package ShuZhu;

import java.util.Scanner;

public class Dome11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入数组的行列：");
        int hang = input.nextInt();
        int lie = input.nextInt();
        int[][] num =new int[hang][lie];
        System.out.println("请输入数组的元素：");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=input.nextInt();
            }
        }

//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j]+"\t");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[j][i] + "\t");
            }
            System.out.println();
        }


    }
}
