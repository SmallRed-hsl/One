package ZhuoYe;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        System.out.println("请输入整数（输入0结束）：");
        int max = 0;//里边放最大值
        int min = 0;//里边放最小值
        int num = 0;//判断第几次输入
        do{

            int a = new Scanner(System.in).nextInt();
            if(num==0){
                max = a;
                min = a;
                num++;
            }

            if(a==0){
                break;
            }
            //System.out.println(max+":"+min);
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }
        }while (true);
        System.out.println("刚才输入的整数中最大的是"+max);
        System.out.println("刚才输入的整数中最小的是"+min);
    }

}
