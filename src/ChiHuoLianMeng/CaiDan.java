package ChiHuoLianMeng;

import java.util.Scanner;

public class CaiDan {
        public int cd() {
            Scanner input = new Scanner(System.in);
            XuanZhe xz = new XuanZhe();
            System.out.println("欢迎使用“吃货联盟订餐系统”");
            System.out.println("***************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("***************************");
            System.out.println("请选择：");
            xz.xz(input.nextInt());
            System.out.println("输入0返回：");
            return input.nextInt();
        }
}
