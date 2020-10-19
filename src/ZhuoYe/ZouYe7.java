package ZhuoYe;

import java.util.Scanner;

public class ZouYe7 {
    public static void main(String[] args) {
//        7、要求用户输入一个0到2之间的整数， * 如果用户输入0输出“你出的是石头”， * 如果用户输入1就输出“你出的是剪刀”， *
//        如果用户输入的是2就输出“你出的是布”， * 然后再问是否要继续出拳
//    ， * 如果回答“y”就重复以上过程，否则结束程序。
       do {
           System.out.println("请输入一个0~2之间的数");
           int a = new Scanner(System.in).nextInt();
           switch (a) {
               case 0:
                   System.out.println("你出的是石头");
                   break;
               case 1:
                   System.out.println("你出的是剪刀");
                   break;
               case 2:
                   System.out.println("你出的是布");
                   break;
           }
           System.out.println("是否继续出拳！");
           if(!new Scanner(System.in).next().toLowerCase().equals("y")){
                break;
           }
       }while (true);
    }
}
