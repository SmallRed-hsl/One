package ZhuoYe;

import java.util.Scanner;

public class ZuoYe161 {
    public static void main(String[] args) {
//        5、用户登录验证。
//        a)、登录时提示用户输入用户名和密码
//        b)、验证用户名和密码的正确性
//        c)、系统提供用户有3次机会输入用户名和密码，如果超过3次仍不能匹配，程序结束
//        提示：for循环 + if   else-if判断

        Scanner input = new Scanner(System.in);
        for (int i = 3; i >= 1; i--) {
            System.out.println("请输入用户名：");
            String Yong = input.next();
            System.out.println("请输入密码：");
            String Pwd = input.next();
            if(Yong.toLowerCase().equals("admin")&&Pwd.equals("12345")){
                System.out.println("欢迎进入二次元世界！");
                break;
            }else{
                  if(i>1){
                    System.out.println("密码错误！请重新输入！还剩"+(i-1)+"次");
                    }else{
                    System.out.println("您已错误三次！");
                }
            }
        }


    }
}
