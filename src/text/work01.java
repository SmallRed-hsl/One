package text;

import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;

                    int max=0;
                    int min=0;
            do {
                System.out.println("输入一个整数,（输入0结束）");
                    num=input.nextInt();
                if(num==0){
                    break;
                }else {
                    if (max<num){
                        max=num;
                    }


                }

            }while (num!=0);
        System.out.println("最大值是"+max);
        System.out.println("最小值是"+min);
    }
}
