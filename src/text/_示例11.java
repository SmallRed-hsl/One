package text;

import java.util.Scanner;

public class _示例11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

          while (true){
              System.out.println("请输入文字 输入bye结束");
              String str=input.next();
              if (str.equals("bye")){
                        break;
              }else {
                  System.out.println("你输入的文字是"+str);
              }
          }
        System.out.println("循环结束");
    }
}
