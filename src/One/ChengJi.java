package One;

import java.util.Scanner;

public class ChengJi {
    public static void main(String[] age){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = input.next();

        boolean boolea = true;
        do{

            int num2=0;         //初始化
            int i = 0;          //初始化循环值

                while(i<5){         //循环
                    System.out.println("请输入5门功课中第"+(i+1)+"门课的成绩：");
                    int num1 = input.nextInt();    //循环接收用户输入的每门成绩
                    num2=num2+num1;                 //累加成绩
                    i++;            //更新循环值
                }
                System.out.println(name+"平均分："+(num2/5)+"\n");          //输出并计算出平均分

                System.out.println("继续输入吗！（y/n）");
                String bool = input.next();
            if(bool.toLowerCase().equals("y")){                     //判断用户是否继续操作
                boolea = true;                  //继续为ture
            }else{                                              //更新外层do while循环boolea的值
                boolea = false;                 //不继续为false
            }

        }while(boolea);
        System.out.println("拜拜傻逼");







    }
}
