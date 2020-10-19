package ZhuoYe;

import java.util.Scanner;

public class One_name {
//    编程题：
//            1、请根据英文单词的第一个字母判断星期几，如果第一个字母一样，
//    则继续判断第二个字母。例如：如果第一个字母S，则继续判读第二个字母，
//    如果第二个字母是a,则输出“星期六”。

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bool = input.next();
            if(bool.toUpperCase().equals("M")){
                System.out.println("今天是Monday");
            }if(bool.toUpperCase().equals("T")){
            if(input.next().toLowerCase().equals("h")){
                System.out.println("今天是Thursday");
            }else {

                System.out.println("今天是Tuesday");
            }
            }if(bool.toUpperCase().equals("W")){
                System.out.println("今天是Wednesday");
            }

            //System.out.println("今天是Monday");
            if(bool.toUpperCase().equals("S")){
                if(input.next().toLowerCase().equals("u")){
                    System.out.println("今天是Sunday");
                }else {
                    System.out.println("今天是Saturday");
                }
        }




    }
}
