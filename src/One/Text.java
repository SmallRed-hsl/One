package One;

import java.util.Scanner;

public class Text {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int custNo;      //客户会员号
//        System.out.println("请输入4位会员号:");
//        custNo = input.nextInt();     //获取用户输入
//        System.out.println("会员号是："+ custNo);
//        int gewei = custNo % 10;            //分解获得个位数
//        int shiwei = custNo / 10 % 10;      //分解获得十位数
//        int baiwei = custNo / 100 % 10;     //分解获得百位数
//        int qianwei = custNo /1000;         //分解获得千位数
//        System.out.println(gewei+"\t"+shiwei+"\t"+baiwei+"\t"+qianwei);
//
//
//
//
//    }

public static void main(String[] age){

    for(int i =1; i <=9; i++){
        for(int j =1;j <= i ; j++){

                    System.out.print(i+"*"+j+"="+(i*j)+"\t");
        }
        System.out.println();
    }

}
}
