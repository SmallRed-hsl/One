package text;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="";
      do {
          int money=5000;
          System.out.println("请输入你要出行的月份");
          int month=input.nextInt();
          System.out.println("请问你选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
          int chooise=input.nextInt();
          if(month>=4&&month<=10){
              if (chooise==1){
                  System.out.println("你的机票价格为"+money*0.9);
              }else {
                  System.out.println("你的机票价格为"+money*0.6);
              }
          }else {
              if (chooise==1){
                  System.out.println("你的机票价格为"+money*0.5);
              }else {
                  System.out.println("你的机票价格为"+money*0.4);
              }
          }
          System.out.println("是否继续购买 y确认继续购买输入n结束");
           str=input.next();
      }while (str.equals("y"));
        System.out.println("旅行愉快");
    }
}
