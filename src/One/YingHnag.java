package One;

import java.util.Scanner;

public class YingHnag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本金：");
        try {
            double num = input.nextInt();
            if(num!=100){
                System.out.println("存取一年后的利息为："+((num*0.0225)+num));
                System.out.println("存取两年后的利息为："+(((num*0.027)*2)+num));
                System.out.println("存取三年后的利息为："+((num*0.0324)+num));
                System.out.println("存取五年年后的利息为："+Math.round(((num*0.036)+num)));
            }else {
                System.out.println("不能小于100");
            }
        } catch (Exception e) {
            System.out.println("请输入数字！");
        }

    }
}
