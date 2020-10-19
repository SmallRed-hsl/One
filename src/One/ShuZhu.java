package One;

import java.util.Scanner;
import  java.util.Arrays;
public class ShuZhu {
    public static void main(String[] age){
        Scanner input = new Scanner(System.in);
        String[] num = new String[5];
        String[] sum = new String[5];
        System.out.println("输入5句话：");

        for (int i = 0; i < num.length ; i++ ){
            System.out.println("第"+(i+1)+"句话");
            num[i] = input.next();
        }
        System.out.println("逆向输出五句话");
        for (int j = num.length-1; j >=0 ; j--){

            System.out.println(num[j]);

        }
        int[] biu = new int[]{1,3,-1,5,-2};
            Arrays.sort(biu);
            for(int l = 0 ; l < biu.length;l++){
                System.out.println(biu[l]);
            }
            for (int g = biu.length-1; g >= 0 ; g-- ){
                System.out.println(biu[g]);
            }
            System.out.println("请输入10个数：");
            int[] a = new int[10];
            for (int m = 0 ; m < 10 ; m++){
               a[m] = input.nextInt();
            }
            System.out.println("输入的10位数为");
            int b = 0;
            int c = 0;
            int k = 0;
            int o = 0;
             for (int i = 0; i < a.length; i++) {
                 System.out.print(" "+a[i]);
                 switch(a[i]){
                     case 1:
                         b++;
                         break;
                     case 2:
                         c++;
                         break;
                     case 3:
                         k++;
                         break;
                     default:
                         o++;
                         break;

                 }
             }
            System.out.println("\n数字为1的个数："+b);
            System.out.println("数字为2的个数："+c);
            System.out.println("数字为3的个数："+k);
            System.out.println("非法数字的个数："+o);


    }
}
