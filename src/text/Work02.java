package text;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;




            do {
                System.out.println("请输入数字1~7(输入0结束)");
                 num=input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("今天是星期一");
                        break;
                    case 2:
                        System.out.println("今天是星期二");
                        break;
                    case 3:
                        System.out.println("今天是星期三");
                        break;
                    case 4:
                        System.out.println("今天是星期四");
                        break;
                    case 5:
                        System.out.println("今天是星期五");
                        break;
                    case 6:
                        System.out.println("今天是星期六");
                        break;
                    case 7:
                        System.out.println("今天是星期天");
                        break;


            }
        }while (num!=0);
        System.out.println("程序结束");
    }
}
