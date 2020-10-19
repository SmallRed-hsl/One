package ShuZhu;

import java.util.Random;

public class Dome3 {
//    3. 向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
//1)升序输出、降序输出
//2)输出总和、平均数

    public static void main(String[] age){
        int[] num = new int[10];
        Random rand = new Random();
        double a = 0 ;
        for (int i = 0; i < num.length; i++) {
           num[i] = rand.nextInt(10);
           a += num[i];
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
        for (int h:num) {
            System.out.print(h+" ");
        }
        System.out.println("\n*******************");
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
                if(num[j]>num[j+1]){
                    int tamp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tamp;
                }
            }
        }
        for (int h:num) {
            System.out.print(h+" ");
        }
        System.out.println("\n总和："+a+"平均分："+a/num.length);
    }
}
