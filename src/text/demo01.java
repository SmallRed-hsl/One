package text;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String end="";
        int sum=0;
   do {
       System.out.println("输入学生姓名");
       String name=input.next();
       for (int i=1;i<=5;i++){
           System.out.println("请输入第"+i+"门功课的成绩");
           int  score=input.nextInt();
           sum=sum+score;
       }
       System.out.println(name+"的五门功课的成绩是"+sum);
       System.out.println("继续输入嘛y/n");
       end=input.next();
   }while (end.equals("y"));
        System.out.println("退出");
    }

}
