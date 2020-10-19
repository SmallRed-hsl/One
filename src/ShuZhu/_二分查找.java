package ShuZhu;

import java.util.Scanner;

public class _二分查找 {
    public static void main(String[] args) {
        int[] num =new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        int conter = num.length/2;
        System.out.println(conter);
        boolean bool = true;
        Scanner input=new Scanner(System.in);
        int b =input.nextInt();
        for (int i = 0; i < conter; i++) {
            if(num[i]==b){
                System.out.println("在前面");
                bool = true;
            }else {
                bool =false;
            }
        }
        if(bool==false){

            for (int i = conter; i <= num.length-conter; i++) {
                if(num[i]==b){
                    System.out.println("在后面");
                }
            }
        }
    }
}
