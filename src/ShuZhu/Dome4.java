package ShuZhu;

import java.util.Random;

public class Dome4 {
    public static void main(String[] args) {
        int[] num =new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rand = new Random();
        int[] aa = new int[10];
        for (int i = 0; i < num.length; i++) {
            aa[i] = rand.nextInt(10);//依次添加
        }   //随机数数组  遍历与输出


        int[] k = new int[10];                  //次数
        for (int i = 0; i < num.length; i++) {
            int a = 0;                              //出现的次数    放在第一个for里面来更新每个数出现的次数
            for (int j = 0; j < num.length; j++) {
                if (aa[j] == num[i]) {              //找到  并 累计
                    a++;
                }
            }
            k[i] = a;                                 //放进k数组中依次对应下标
            if (k[i] >= 1) {                                          //限制出现为0的
                System.out.println(num[i] + "出现了" + k[i]);
            }
        }//0~9出现多少次



        int ou = 0;     //出现多少次
        int index = 0;   //那个数
        int qq = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] > ou) {
                ou = k[i];
                index = i;
            }
            if (k[i] == 1) {
                qq++;                   //累加出现一次的个数用于给与数组c长度
            }

        }


        int[] c = new int[qq];
        int j = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] == 1) {
                c[j++] = i;
            }
        }
        int m = c[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i] < j) {
                j = c[i];
            }
        }


        System.out.println(index + "出现次数最多，出现了：" + ou + "次");
        System.out.println("出现一次的数字中最小的数字:" + m);
    }
}
