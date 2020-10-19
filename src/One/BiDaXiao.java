package One;

import java.util.Scanner;

public class BiDaXiao {
    public static void main(String[] age){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int smali = 0;
        int max = 0 ;
        do{
            System.out.println("请输入一个整数：（输到0时结束）：");
            num = input.nextInt();
            if(smali == 0){
                smali = max;
            }
            if(num != 0 && num > 0 ){
                if(num > max){
                    max = num;
                }
                if(smali < num){
                       smali = num;
                }
            }else {

                break;


            }
        }while(num!=0);
        System.out.println("最大值；"+max+"最小值："+smali);
    }
}
